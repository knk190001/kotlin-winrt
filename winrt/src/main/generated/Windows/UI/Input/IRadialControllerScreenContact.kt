package Windows.UI.Input

import Windows.Foundation.Point
import Windows.Foundation.Rect
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadialControllerScreenContact.ABI::class)
@Signature("{206aa434-e651-11e5-bf62-2c27d7404e85}")
@Guid("206aa434e65111e5bf622c27d7404e85")
@WinRTInterface("206aa434e65111e5bf622c27d7404e85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerScreenContact.ByReference::class)
public interface IRadialControllerScreenContact : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bounds(): Rect?

  @InterfaceMethod(1)
  public fun get_Position(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerScreenContact> {
    public override fun getValue() = ABI.makeIRadialControllerScreenContact(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerScreenContact_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerScreenContact {
    public val __556204885_Ptr: Pointer?

    public val _556204885_VtblPtr: Pointer?
      get() = __556204885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _556204885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__556204885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Point? {
      val fnPtr = _556204885_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__556204885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerScreenContact_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __556204885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerScreenContact, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("206aa434e65111e5bf622c27d7404e85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerScreenContact(ptr: Pointer?): WithDefault =
        IRadialControllerScreenContact_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerScreenContact {
      val address = segment.toRawLongValue()
      return makeIRadialControllerScreenContact(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerScreenContact): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__556204885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerScreenContact):
        Array<IRadialControllerScreenContact?> = (elements as
        Array<IRadialControllerScreenContact?>).castToImpl<IRadialControllerScreenContact,IRadialControllerScreenContact_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerScreenContact?> =
        arrayOfNulls<IRadialControllerScreenContact_Impl>(size) as
        Array<IRadialControllerScreenContact?>
  }
}
