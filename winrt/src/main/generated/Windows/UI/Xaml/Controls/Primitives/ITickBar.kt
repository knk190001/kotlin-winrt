package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Media.Brush
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

@ABIMarker(ITickBar.ABI::class)
@Signature("{994683fa-f1f6-487d-a5ac-c15921bfa995}")
@Guid("994683faf1f6487da5acc15921bfa995")
@WinRTInterface("994683faf1f6487da5acc15921bfa995")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITickBar.ByReference::class)
public interface ITickBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Fill(): Brush?

  @InterfaceMethod(1)
  public fun put_Fill(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITickBar> {
    public override fun getValue() = ABI.makeITickBar(pointer.getPointer(0))

    public fun setValue(value: ITickBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITickBar {
    public val __963245786_Ptr: Pointer?

    public val _963245786_VtblPtr: Pointer?
      get() = __963245786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Fill(): Brush? {
      val fnPtr = _963245786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__963245786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Fill(value: Brush?): Unit {
      val fnPtr = _963245786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__963245786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITickBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __963245786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITickBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("994683faf1f6487da5acc15921bfa995")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITickBar(ptr: Pointer?): WithDefault = ITickBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITickBar {
      val address = segment.toRawLongValue()
      return makeITickBar(Pointer(address))
    }

    public override fun toNative(obj: ITickBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__963245786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITickBar): Array<ITickBar?> = (elements as
        Array<ITickBar?>).castToImpl<ITickBar,ITickBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITickBar?> = arrayOfNulls<ITickBar_Impl>(size) as
        Array<ITickBar?>
  }
}
