package Microsoft.UI.Xaml.Controls

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBreadcrumbBarStatics.ABI::class)
@Signature("{4abf3fb5-6f69-54e2-a68f-e5f904f79f38}")
@Guid("4abf3fb56f6954e2a68fe5f904f79f38")
@WinRTInterface("4abf3fb56f6954e2a68fe5f904f79f38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBreadcrumbBarStatics.ByReference::class)
public interface IBreadcrumbBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemTemplateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBreadcrumbBarStatics> {
    public override fun getValue() = ABI.makeIBreadcrumbBarStatics(pointer.getPointer(0))

    public fun setValue(value: IBreadcrumbBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBreadcrumbBarStatics {
    public val __1811364060_Ptr: Pointer?

    public val _1811364060_VtblPtr: Pointer?
      get() = __1811364060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _1811364060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1811364060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _1811364060_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1811364060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBreadcrumbBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1811364060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBreadcrumbBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4abf3fb56f6954e2a68fe5f904f79f38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBreadcrumbBarStatics(ptr: Pointer?): WithDefault =
        IBreadcrumbBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBreadcrumbBarStatics {
      val address = segment.toRawLongValue()
      return makeIBreadcrumbBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IBreadcrumbBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1811364060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBreadcrumbBarStatics): Array<IBreadcrumbBarStatics?> =
        (elements as
        Array<IBreadcrumbBarStatics?>).castToImpl<IBreadcrumbBarStatics,IBreadcrumbBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBreadcrumbBarStatics?> =
        arrayOfNulls<IBreadcrumbBarStatics_Impl>(size) as Array<IBreadcrumbBarStatics?>
  }
}
