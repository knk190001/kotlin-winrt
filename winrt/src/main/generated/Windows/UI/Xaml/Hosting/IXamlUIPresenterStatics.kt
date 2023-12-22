package Windows.UI.Xaml.Hosting

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

@ABIMarker(IXamlUIPresenterStatics.ABI::class)
@Signature("{71eaeac8-45e1-4192-85aa-3a422edd23cf}")
@Guid("71eaeac845e1419285aa3a422edd23cf")
@WinRTInterface("71eaeac845e1419285aa3a422edd23cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUIPresenterStatics.ByReference::class)
public interface IXamlUIPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompleteTimelinesAutomatically(): Boolean

  @InterfaceMethod(1)
  public fun put_CompleteTimelinesAutomatically(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun SetHost(host: IXamlUIPresenterHost?): Unit

  @InterfaceMethod(3)
  public fun NotifyWindowSizeChanged(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlUIPresenterStatics> {
    public override fun getValue() = ABI.makeIXamlUIPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlUIPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUIPresenterStatics {
    public val __407880673_Ptr: Pointer?

    public val _407880673_VtblPtr: Pointer?
      get() = __407880673_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompleteTimelinesAutomatically(): Boolean {
      val fnPtr = _407880673_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__407880673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CompleteTimelinesAutomatically(value: Boolean): Unit {
      val fnPtr = _407880673_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407880673_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetHost(host: IXamlUIPresenterHost?): Unit {
      val fnPtr = _407880673_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407880673_Ptr, marshalToNative(host),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun NotifyWindowSizeChanged(): Unit {
      val fnPtr = _407880673_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407880673_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlUIPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407880673_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUIPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71eaeac845e1419285aa3a422edd23cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUIPresenterStatics(ptr: Pointer?): WithDefault =
        IXamlUIPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUIPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIXamlUIPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlUIPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407880673_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUIPresenterStatics): Array<IXamlUIPresenterStatics?>
        = (elements as
        Array<IXamlUIPresenterStatics?>).castToImpl<IXamlUIPresenterStatics,IXamlUIPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUIPresenterStatics?> =
        arrayOfNulls<IXamlUIPresenterStatics_Impl>(size) as Array<IXamlUIPresenterStatics?>
  }
}
