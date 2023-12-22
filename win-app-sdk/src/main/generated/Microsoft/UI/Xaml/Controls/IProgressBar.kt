package Microsoft.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProgressBar.ABI::class)
@Signature("{87555c8c-0aaf-52c1-8390-0db17f40438e}")
@Guid("87555c8c0aaf52c183900db17f40438e")
@WinRTInterface("87555c8c0aaf52c183900db17f40438e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressBar.ByReference::class)
public interface IProgressBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsIndeterminate(): Boolean

  @InterfaceMethod(1)
  public fun put_IsIndeterminate(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ShowError(): Boolean

  @InterfaceMethod(3)
  public fun put_ShowError(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_ShowPaused(): Boolean

  @InterfaceMethod(5)
  public fun put_ShowPaused(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_TemplateSettings(): ProgressBarTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IProgressBar> {
    public override fun getValue() = ABI.makeIProgressBar(pointer.getPointer(0))

    public fun setValue(value: IProgressBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressBar {
    public val __431024513_Ptr: Pointer?

    public val _431024513_VtblPtr: Pointer?
      get() = __431024513_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsIndeterminate(): Boolean {
      val fnPtr = _431024513_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__431024513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsIndeterminate(value: Boolean): Unit {
      val fnPtr = _431024513_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431024513_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ShowError(): Boolean {
      val fnPtr = _431024513_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__431024513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ShowError(value: Boolean): Unit {
      val fnPtr = _431024513_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431024513_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ShowPaused(): Boolean {
      val fnPtr = _431024513_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__431024513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ShowPaused(value: Boolean): Unit {
      val fnPtr = _431024513_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431024513_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TemplateSettings(): ProgressBarTemplateSettings? {
      val fnPtr = _431024513_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProgressBarTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__431024513_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProgressBarTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IProgressBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __431024513_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87555c8c0aaf52c183900db17f40438e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressBar(ptr: Pointer?): WithDefault = IProgressBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressBar {
      val address = segment.toRawLongValue()
      return makeIProgressBar(Pointer(address))
    }

    public override fun toNative(obj: IProgressBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__431024513_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressBar): Array<IProgressBar?> = (elements as
        Array<IProgressBar?>).castToImpl<IProgressBar,IProgressBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressBar?> =
        arrayOfNulls<IProgressBar_Impl>(size) as Array<IProgressBar?>
  }
}
