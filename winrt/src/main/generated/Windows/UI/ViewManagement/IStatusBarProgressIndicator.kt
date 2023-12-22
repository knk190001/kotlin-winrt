package Windows.UI.ViewManagement

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IReference
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStatusBarProgressIndicator.ABI::class)
@Signature("{76cb2670-a3d7-49cf-8200-4f3eedca27bb}")
@Guid("76cb2670a3d749cf82004f3eedca27bb")
@WinRTInterface("76cb2670a3d749cf82004f3eedca27bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStatusBarProgressIndicator.ByReference::class)
public interface IStatusBarProgressIndicator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun HideAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun get_Text(): String?

  @InterfaceMethod(3)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_ProgressValue(): IReference<Double>?

  @InterfaceMethod(5)
  public fun put_ProgressValue(value: IReference<Double>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStatusBarProgressIndicator> {
    public override fun getValue() = ABI.makeIStatusBarProgressIndicator(pointer.getPointer(0))

    public fun setValue(value: IStatusBarProgressIndicator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStatusBarProgressIndicator {
    public val __1269480883_Ptr: Pointer?

    public val _1269480883_VtblPtr: Pointer?
      get() = __1269480883_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowAsync(): IAsyncAction? {
      val fnPtr = _1269480883_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1269480883_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun HideAsync(): IAsyncAction? {
      val fnPtr = _1269480883_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1269480883_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Text(): String? {
      val fnPtr = _1269480883_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269480883_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _1269480883_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269480883_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ProgressValue(): IReference<Double>? {
      val fnPtr = _1269480883_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1269480883_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ProgressValue(value: IReference<Double>?): Unit {
      val fnPtr = _1269480883_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269480883_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStatusBarProgressIndicator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1269480883_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStatusBarProgressIndicator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76cb2670a3d749cf82004f3eedca27bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStatusBarProgressIndicator(ptr: Pointer?): WithDefault =
        IStatusBarProgressIndicator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStatusBarProgressIndicator {
      val address = segment.toRawLongValue()
      return makeIStatusBarProgressIndicator(Pointer(address))
    }

    public override fun toNative(obj: IStatusBarProgressIndicator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1269480883_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStatusBarProgressIndicator):
        Array<IStatusBarProgressIndicator?> = (elements as
        Array<IStatusBarProgressIndicator?>).castToImpl<IStatusBarProgressIndicator,IStatusBarProgressIndicator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStatusBarProgressIndicator?> =
        arrayOfNulls<IStatusBarProgressIndicator_Impl>(size) as Array<IStatusBarProgressIndicator?>
  }
}
