package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IBreadcrumbBarItemFactory.ABI::class)
@Signature("{186c3bd3-7008-5544-8d3a-65af8fe9fe69}")
@Guid("186c3bd3700855448d3a65af8fe9fe69")
@WinRTInterface("186c3bd3700855448d3a65af8fe9fe69")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBreadcrumbBarItemFactory.ByReference::class)
public interface IBreadcrumbBarItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): BreadcrumbBarItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBreadcrumbBarItemFactory> {
    public override fun getValue() = ABI.makeIBreadcrumbBarItemFactory(pointer.getPointer(0))

    public fun setValue(value: IBreadcrumbBarItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBreadcrumbBarItemFactory {
    public val __589502478_Ptr: Pointer?

    public val _589502478_VtblPtr: Pointer?
      get() = __589502478_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        BreadcrumbBarItem? {
      val fnPtr = _589502478_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BreadcrumbBarItem>()
      val hr = fn.invokeHR(arrayOf(__589502478_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BreadcrumbBarItem>(result.getValue())
      return resultValue
    }
  }

  public class IBreadcrumbBarItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589502478_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBreadcrumbBarItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("186c3bd3700855448d3a65af8fe9fe69")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBreadcrumbBarItemFactory(ptr: Pointer?): WithDefault =
        IBreadcrumbBarItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBreadcrumbBarItemFactory {
      val address = segment.toRawLongValue()
      return makeIBreadcrumbBarItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IBreadcrumbBarItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589502478_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBreadcrumbBarItemFactory):
        Array<IBreadcrumbBarItemFactory?> = (elements as
        Array<IBreadcrumbBarItemFactory?>).castToImpl<IBreadcrumbBarItemFactory,IBreadcrumbBarItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBreadcrumbBarItemFactory?> =
        arrayOfNulls<IBreadcrumbBarItemFactory_Impl>(size) as Array<IBreadcrumbBarItemFactory?>
  }
}
