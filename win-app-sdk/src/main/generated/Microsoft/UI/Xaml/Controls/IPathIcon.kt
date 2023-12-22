package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.Geometry
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

@ABIMarker(IPathIcon.ABI::class)
@Signature("{5c8229db-51cd-5a3b-88ef-1d9a8ac97683}")
@Guid("5c8229db51cd5a3b88ef1d9a8ac97683")
@WinRTInterface("5c8229db51cd5a3b88ef1d9a8ac97683")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathIcon.ByReference::class)
public interface IPathIcon : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): Geometry?

  @InterfaceMethod(1)
  public fun put_Data(value: Geometry?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPathIcon> {
    public override fun getValue() = ABI.makeIPathIcon(pointer.getPointer(0))

    public fun setValue(value: IPathIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathIcon {
    public val __938184965_Ptr: Pointer?

    public val _938184965_VtblPtr: Pointer?
      get() = __938184965_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): Geometry? {
      val fnPtr = _938184965_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geometry>()
      val hr = fn.invokeHR(arrayOf(__938184965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Data(value: Geometry?): Unit {
      val fnPtr = _938184965_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__938184965_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPathIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __938184965_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c8229db51cd5a3b88ef1d9a8ac97683")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathIcon(ptr: Pointer?): WithDefault = IPathIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathIcon {
      val address = segment.toRawLongValue()
      return makeIPathIcon(Pointer(address))
    }

    public override fun toNative(obj: IPathIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__938184965_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathIcon): Array<IPathIcon?> = (elements as
        Array<IPathIcon?>).castToImpl<IPathIcon,IPathIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathIcon?> = arrayOfNulls<IPathIcon_Impl>(size)
        as Array<IPathIcon?>
  }
}
