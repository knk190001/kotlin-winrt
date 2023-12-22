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

@ABIMarker(IBreadcrumbBarFactory.ABI::class)
@Signature("{d5b6a6d9-3148-5cbc-a6ae-0f44cde41952}")
@Guid("d5b6a6d931485cbca6ae0f44cde41952")
@WinRTInterface("d5b6a6d931485cbca6ae0f44cde41952")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBreadcrumbBarFactory.ByReference::class)
public interface IBreadcrumbBarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): BreadcrumbBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBreadcrumbBarFactory> {
    public override fun getValue() = ABI.makeIBreadcrumbBarFactory(pointer.getPointer(0))

    public fun setValue(value: IBreadcrumbBarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBreadcrumbBarFactory {
    public val __1678349791_Ptr: Pointer?

    public val _1678349791_VtblPtr: Pointer?
      get() = __1678349791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        BreadcrumbBar? {
      val fnPtr = _1678349791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BreadcrumbBar>()
      val hr = fn.invokeHR(arrayOf(__1678349791_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BreadcrumbBar>(result.getValue())
      return resultValue
    }
  }

  public class IBreadcrumbBarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1678349791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBreadcrumbBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5b6a6d931485cbca6ae0f44cde41952")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBreadcrumbBarFactory(ptr: Pointer?): WithDefault =
        IBreadcrumbBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBreadcrumbBarFactory {
      val address = segment.toRawLongValue()
      return makeIBreadcrumbBarFactory(Pointer(address))
    }

    public override fun toNative(obj: IBreadcrumbBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1678349791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBreadcrumbBarFactory): Array<IBreadcrumbBarFactory?> =
        (elements as
        Array<IBreadcrumbBarFactory?>).castToImpl<IBreadcrumbBarFactory,IBreadcrumbBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBreadcrumbBarFactory?> =
        arrayOfNulls<IBreadcrumbBarFactory_Impl>(size) as Array<IBreadcrumbBarFactory?>
  }
}
