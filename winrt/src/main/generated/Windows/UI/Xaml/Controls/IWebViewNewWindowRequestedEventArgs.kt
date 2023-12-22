package Windows.UI.Xaml.Controls

import Windows.Foundation.Uri
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

@ABIMarker(IWebViewNewWindowRequestedEventArgs.ABI::class)
@Signature("{470fa818-6862-44d9-b3d1-c0696373de35}")
@Guid("470fa818686244d9b3d1c0696373de35")
@WinRTInterface("470fa818686244d9b3d1c0696373de35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewNewWindowRequestedEventArgs.ByReference::class)
public interface IWebViewNewWindowRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_Referrer(): Uri?

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewNewWindowRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewNewWindowRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewNewWindowRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewNewWindowRequestedEventArgs {
    public val __1149399588_Ptr: Pointer?

    public val _1149399588_VtblPtr: Pointer?
      get() = __1149399588_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1149399588_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1149399588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Referrer(): Uri? {
      val fnPtr = _1149399588_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1149399588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1149399588_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1149399588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1149399588_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1149399588_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewNewWindowRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1149399588_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewNewWindowRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("470fa818686244d9b3d1c0696373de35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewNewWindowRequestedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewNewWindowRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewNewWindowRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewNewWindowRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewNewWindowRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1149399588_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewNewWindowRequestedEventArgs):
        Array<IWebViewNewWindowRequestedEventArgs?> = (elements as
        Array<IWebViewNewWindowRequestedEventArgs?>).castToImpl<IWebViewNewWindowRequestedEventArgs,IWebViewNewWindowRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewNewWindowRequestedEventArgs?> =
        arrayOfNulls<IWebViewNewWindowRequestedEventArgs_Impl>(size) as
        Array<IWebViewNewWindowRequestedEventArgs?>
  }
}
