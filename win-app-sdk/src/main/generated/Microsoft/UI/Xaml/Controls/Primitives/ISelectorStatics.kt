package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ISelectorStatics.ABI::class)
@Signature("{569b2234-1ceb-516e-b64e-0d479452e279}")
@Guid("569b22341ceb516eb64e0d479452e279")
@WinRTInterface("569b22341ceb516eb64e0d479452e279")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectorStatics.ByReference::class)
public interface ISelectorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedIndexProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SelectedItemProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_SelectedValueProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_SelectedValuePathProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsSynchronizedWithCurrentItemProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun GetIsSelectionActive(element: DependencyObject?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectorStatics> {
    public override fun getValue() = ABI.makeISelectorStatics(pointer.getPointer(0))

    public fun setValue(value: ISelectorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectorStatics {
    public val __2129043851_Ptr: Pointer?

    public val _2129043851_VtblPtr: Pointer?
      get() = __2129043851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedIndexProperty(): DependencyProperty? {
      val fnPtr = _2129043851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2129043851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectedItemProperty(): DependencyProperty? {
      val fnPtr = _2129043851_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2129043851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SelectedValueProperty(): DependencyProperty? {
      val fnPtr = _2129043851_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2129043851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SelectedValuePathProperty(): DependencyProperty? {
      val fnPtr = _2129043851_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2129043851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsSynchronizedWithCurrentItemProperty(): DependencyProperty? {
      val fnPtr = _2129043851_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2129043851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetIsSelectionActive(element: DependencyObject?): Boolean {
      val fnPtr = _2129043851_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2129043851_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISelectorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129043851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("569b22341ceb516eb64e0d479452e279")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectorStatics(ptr: Pointer?): WithDefault = ISelectorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectorStatics {
      val address = segment.toRawLongValue()
      return makeISelectorStatics(Pointer(address))
    }

    public override fun toNative(obj: ISelectorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129043851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectorStatics): Array<ISelectorStatics?> = (elements as
        Array<ISelectorStatics?>).castToImpl<ISelectorStatics,ISelectorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectorStatics?> =
        arrayOfNulls<ISelectorStatics_Impl>(size) as Array<ISelectorStatics?>
  }
}
