package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.Geometry
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

@ABIMarker(IPathIconSource.ABI::class)
@Signature("{1f47010e-b305-4863-8b7a-15d08d633c7a}")
@Guid("1f47010eb30548638b7a15d08d633c7a")
@WinRTInterface("1f47010eb30548638b7a15d08d633c7a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathIconSource.ByReference::class)
public interface IPathIconSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): Geometry?

  @InterfaceMethod(1)
  public fun put_Data(value: Geometry?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathIconSource> {
    public override fun getValue() = ABI.makeIPathIconSource(pointer.getPointer(0))

    public fun setValue(value: IPathIconSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathIconSource {
    public val __774873877_Ptr: Pointer?

    public val _774873877_VtblPtr: Pointer?
      get() = __774873877_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): Geometry? {
      val fnPtr = _774873877_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geometry>()
      val hr = fn.invokeHR(arrayOf(__774873877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Data(value: Geometry?): Unit {
      val fnPtr = _774873877_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__774873877_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPathIconSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __774873877_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathIconSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f47010eb30548638b7a15d08d633c7a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathIconSource(ptr: Pointer?): WithDefault = IPathIconSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathIconSource {
      val address = segment.toRawLongValue()
      return makeIPathIconSource(Pointer(address))
    }

    public override fun toNative(obj: IPathIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__774873877_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathIconSource): Array<IPathIconSource?> = (elements as
        Array<IPathIconSource?>).castToImpl<IPathIconSource,IPathIconSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathIconSource?> =
        arrayOfNulls<IPathIconSource_Impl>(size) as Array<IPathIconSource?>
  }
}
