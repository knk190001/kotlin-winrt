package Windows.System

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

@ABIMarker(IAppUriHandlerRegistrationManager2.ABI::class)
@Signature("{bddfcaf1-b51a-5e69-aefd-7088d9f2b123}")
@Guid("bddfcaf1b51a5e69aefd7088d9f2b123")
@WinRTInterface("bddfcaf1b51a5e69aefd7088d9f2b123")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUriHandlerRegistrationManager2.ByReference::class)
public interface IAppUriHandlerRegistrationManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PackageFamilyName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUriHandlerRegistrationManager2> {
    public override fun getValue() =
        ABI.makeIAppUriHandlerRegistrationManager2(pointer.getPointer(0))

    public fun setValue(value: IAppUriHandlerRegistrationManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUriHandlerRegistrationManager2 {
    public val __1780393038_Ptr: Pointer?

    public val _1780393038_VtblPtr: Pointer?
      get() = __1780393038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _1780393038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1780393038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppUriHandlerRegistrationManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1780393038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUriHandlerRegistrationManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bddfcaf1b51a5e69aefd7088d9f2b123")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUriHandlerRegistrationManager2(ptr: Pointer?): WithDefault =
        IAppUriHandlerRegistrationManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppUriHandlerRegistrationManager2 {
      val address = segment.toRawLongValue()
      return makeIAppUriHandlerRegistrationManager2(Pointer(address))
    }

    public override fun toNative(obj: IAppUriHandlerRegistrationManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1780393038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUriHandlerRegistrationManager2):
        Array<IAppUriHandlerRegistrationManager2?> = (elements as
        Array<IAppUriHandlerRegistrationManager2?>).castToImpl<IAppUriHandlerRegistrationManager2,IAppUriHandlerRegistrationManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUriHandlerRegistrationManager2?> =
        arrayOfNulls<IAppUriHandlerRegistrationManager2_Impl>(size) as
        Array<IAppUriHandlerRegistrationManager2?>
  }
}
