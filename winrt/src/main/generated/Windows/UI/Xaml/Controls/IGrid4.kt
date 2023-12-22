package Windows.UI.Xaml.Controls

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

@ABIMarker(IGrid4.ABI::class)
@Signature("{ed02d274-81f1-5ac2-a0c3-bbdaf5a3ffee}")
@Guid("ed02d27481f15ac2a0c3bbdaf5a3ffee")
@WinRTInterface("ed02d27481f15ac2a0c3bbdaf5a3ffee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGrid4.ByReference::class)
public interface IGrid4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizing(): BackgroundSizing?

  @InterfaceMethod(1)
  public fun put_BackgroundSizing(value: BackgroundSizing?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGrid4> {
    public override fun getValue() = ABI.makeIGrid4(pointer.getPointer(0))

    public fun setValue(value: IGrid4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGrid4 {
    public val __12825362_Ptr: Pointer?

    public val _12825362_VtblPtr: Pointer?
      get() = __12825362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizing(): BackgroundSizing? {
      val fnPtr = _12825362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundSizing>()
      val hr = fn.invokeHR(arrayOf(__12825362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundSizing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundSizing(value: BackgroundSizing?): Unit {
      val fnPtr = _12825362_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__12825362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGrid4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __12825362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGrid4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed02d27481f15ac2a0c3bbdaf5a3ffee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGrid4(ptr: Pointer?): WithDefault = IGrid4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGrid4 {
      val address = segment.toRawLongValue()
      return makeIGrid4(Pointer(address))
    }

    public override fun toNative(obj: IGrid4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__12825362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGrid4): Array<IGrid4?> = (elements as
        Array<IGrid4?>).castToImpl<IGrid4,IGrid4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGrid4?> = arrayOfNulls<IGrid4_Impl>(size) as
        Array<IGrid4?>
  }
}
