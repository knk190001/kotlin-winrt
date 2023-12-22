package Windows.ApplicationModel.AppService

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

@ABIMarker(IAppServiceTriggerDetails4.ABI::class)
@Signature("{1185b180-8861-5e30-ab55-1cf4d08bbf6d}")
@Guid("1185b18088615e30ab551cf4d08bbf6d")
@WinRTInterface("1185b18088615e30ab551cf4d08bbf6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceTriggerDetails4.ByReference::class)
public interface IAppServiceTriggerDetails4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CallerRemoteConnectionToken(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceTriggerDetails4> {
    public override fun getValue() = ABI.makeIAppServiceTriggerDetails4(pointer.getPointer(0))

    public fun setValue(value: IAppServiceTriggerDetails4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceTriggerDetails4 {
    public val __1399652373_Ptr: Pointer?

    public val _1399652373_VtblPtr: Pointer?
      get() = __1399652373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CallerRemoteConnectionToken(): String? {
      val fnPtr = _1399652373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1399652373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppServiceTriggerDetails4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1399652373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceTriggerDetails4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1185b18088615e30ab551cf4d08bbf6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceTriggerDetails4(ptr: Pointer?): WithDefault =
        IAppServiceTriggerDetails4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceTriggerDetails4 {
      val address = segment.toRawLongValue()
      return makeIAppServiceTriggerDetails4(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceTriggerDetails4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1399652373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceTriggerDetails4):
        Array<IAppServiceTriggerDetails4?> = (elements as
        Array<IAppServiceTriggerDetails4?>).castToImpl<IAppServiceTriggerDetails4,IAppServiceTriggerDetails4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceTriggerDetails4?> =
        arrayOfNulls<IAppServiceTriggerDetails4_Impl>(size) as Array<IAppServiceTriggerDetails4?>
  }
}
