package Windows.UI.WindowManagement

import Windows.Foundation.Point
import Windows.Foundation.Size
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

@ABIMarker(IAppWindowPlacement.ABI::class)
@Signature("{03dc815e-e7a9-5857-9c03-7d670594410e}")
@Guid("03dc815ee7a958579c037d670594410e")
@WinRTInterface("03dc815ee7a958579c037d670594410e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowPlacement.ByReference::class)
public interface IAppWindowPlacement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayRegion(): DisplayRegion?

  @InterfaceMethod(1)
  public fun get_Offset(): Point?

  @InterfaceMethod(2)
  public fun get_Size(): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowPlacement> {
    public override fun getValue() = ABI.makeIAppWindowPlacement(pointer.getPointer(0))

    public fun setValue(value: IAppWindowPlacement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowPlacement {
    public val __356611877_Ptr: Pointer?

    public val _356611877_VtblPtr: Pointer?
      get() = __356611877_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayRegion(): DisplayRegion? {
      val fnPtr = _356611877_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayRegion>()
      val hr = fn.invokeHR(arrayOf(__356611877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayRegion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Offset(): Point? {
      val fnPtr = _356611877_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__356611877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Size(): Size? {
      val fnPtr = _356611877_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__356611877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class IAppWindowPlacement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __356611877_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowPlacement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03dc815ee7a958579c037d670594410e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowPlacement(ptr: Pointer?): WithDefault = IAppWindowPlacement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowPlacement {
      val address = segment.toRawLongValue()
      return makeIAppWindowPlacement(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowPlacement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__356611877_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowPlacement): Array<IAppWindowPlacement?> =
        (elements as
        Array<IAppWindowPlacement?>).castToImpl<IAppWindowPlacement,IAppWindowPlacement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowPlacement?> =
        arrayOfNulls<IAppWindowPlacement_Impl>(size) as Array<IAppWindowPlacement?>
  }
}
