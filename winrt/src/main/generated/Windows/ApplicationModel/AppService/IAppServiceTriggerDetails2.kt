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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppServiceTriggerDetails2.ABI::class)
@Signature("{e83d54b2-28cc-43f2-b465-c0482e59e2dc}")
@Guid("e83d54b228cc43f2b465c0482e59e2dc")
@WinRTInterface("e83d54b228cc43f2b465c0482e59e2dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceTriggerDetails2.ByReference::class)
public interface IAppServiceTriggerDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsRemoteSystemConnection(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceTriggerDetails2> {
    public override fun getValue() = ABI.makeIAppServiceTriggerDetails2(pointer.getPointer(0))

    public fun setValue(value: IAppServiceTriggerDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceTriggerDetails2 {
    public val __1399652375_Ptr: Pointer?

    public val _1399652375_VtblPtr: Pointer?
      get() = __1399652375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsRemoteSystemConnection(): Boolean {
      val fnPtr = _1399652375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1399652375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppServiceTriggerDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1399652375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceTriggerDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e83d54b228cc43f2b465c0482e59e2dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceTriggerDetails2(ptr: Pointer?): WithDefault =
        IAppServiceTriggerDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceTriggerDetails2 {
      val address = segment.toRawLongValue()
      return makeIAppServiceTriggerDetails2(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceTriggerDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1399652375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceTriggerDetails2):
        Array<IAppServiceTriggerDetails2?> = (elements as
        Array<IAppServiceTriggerDetails2?>).castToImpl<IAppServiceTriggerDetails2,IAppServiceTriggerDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceTriggerDetails2?> =
        arrayOfNulls<IAppServiceTriggerDetails2_Impl>(size) as Array<IAppServiceTriggerDetails2?>
  }
}
