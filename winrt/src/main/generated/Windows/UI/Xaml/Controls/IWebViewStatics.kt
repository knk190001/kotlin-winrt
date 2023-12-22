package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Uri
import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IWebViewStatics.ABI::class)
@Signature("{a0b561de-5fdb-443b-b9f0-5c30f6b7a1f4}")
@Guid("a0b561de5fdb443bb9f05c30f6b7a1f4")
@WinRTInterface("a0b561de5fdb443bb9f05c30f6b7a1f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewStatics.ByReference::class)
public interface IWebViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnyScriptNotifyUri(): IVector<Uri?>?

  @InterfaceMethod(1)
  public fun get_SourceProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_AllowedScriptNotifyUrisProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_DataTransferPackageProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewStatics> {
    public override fun getValue() = ABI.makeIWebViewStatics(pointer.getPointer(0))

    public fun setValue(value: IWebViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewStatics {
    public val __1497611128_Ptr: Pointer?

    public val _1497611128_VtblPtr: Pointer?
      get() = __1497611128_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnyScriptNotifyUri(): IVector<Uri?>? {
      val fnPtr = _1497611128_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1497611128_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _1497611128_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1497611128_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AllowedScriptNotifyUrisProperty(): DependencyProperty? {
      val fnPtr = _1497611128_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1497611128_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DataTransferPackageProperty(): DependencyProperty? {
      val fnPtr = _1497611128_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1497611128_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1497611128_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0b561de5fdb443bb9f05c30f6b7a1f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewStatics(ptr: Pointer?): WithDefault = IWebViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewStatics {
      val address = segment.toRawLongValue()
      return makeIWebViewStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1497611128_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewStatics): Array<IWebViewStatics?> = (elements as
        Array<IWebViewStatics?>).castToImpl<IWebViewStatics,IWebViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewStatics?> =
        arrayOfNulls<IWebViewStatics_Impl>(size) as Array<IWebViewStatics?>
  }
}
