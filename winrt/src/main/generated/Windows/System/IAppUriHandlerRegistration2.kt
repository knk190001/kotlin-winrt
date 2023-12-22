package Windows.System

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppUriHandlerRegistration2.ABI::class)
@Signature("{d54dac97-cb39-5f1f-883e-01853730bd6d}")
@Guid("d54dac97cb395f1f883e01853730bd6d")
@WinRTInterface("d54dac97cb395f1f883e01853730bd6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUriHandlerRegistration2.ByReference::class)
public interface IAppUriHandlerRegistration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAllHosts(): IVector<AppUriHandlerHost?>?

  @InterfaceMethod(1)
  public fun UpdateHosts(hosts: IIterable<AppUriHandlerHost?>?): Unit

  @InterfaceMethod(2)
  public fun get_PackageFamilyName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUriHandlerRegistration2> {
    public override fun getValue() = ABI.makeIAppUriHandlerRegistration2(pointer.getPointer(0))

    public fun setValue(value: IAppUriHandlerRegistration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUriHandlerRegistration2 {
    public val __1540886967_Ptr: Pointer?

    public val _1540886967_VtblPtr: Pointer?
      get() = __1540886967_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAllHosts(): IVector<AppUriHandlerHost?>? {
      val fnPtr = _1540886967_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AppUriHandlerHost?>>()
      val hr = fn.invokeHR(arrayOf(__1540886967_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AppUriHandlerHost?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UpdateHosts(hosts: IIterable<AppUriHandlerHost?>?): Unit {
      val fnPtr = _1540886967_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1540886967_Ptr, marshalToNative(hosts),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _1540886967_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1540886967_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppUriHandlerRegistration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1540886967_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUriHandlerRegistration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d54dac97cb395f1f883e01853730bd6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUriHandlerRegistration2(ptr: Pointer?): WithDefault =
        IAppUriHandlerRegistration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppUriHandlerRegistration2 {
      val address = segment.toRawLongValue()
      return makeIAppUriHandlerRegistration2(Pointer(address))
    }

    public override fun toNative(obj: IAppUriHandlerRegistration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1540886967_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUriHandlerRegistration2):
        Array<IAppUriHandlerRegistration2?> = (elements as
        Array<IAppUriHandlerRegistration2?>).castToImpl<IAppUriHandlerRegistration2,IAppUriHandlerRegistration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUriHandlerRegistration2?> =
        arrayOfNulls<IAppUriHandlerRegistration2_Impl>(size) as Array<IAppUriHandlerRegistration2?>
  }
}
