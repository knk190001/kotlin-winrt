package Windows.ApplicationModel.Chat

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

@ABIMarker(IChatSyncConfiguration.ABI::class)
@Signature("{09f869b2-69f4-4aff-82b6-06992ff402d2}")
@Guid("09f869b269f44aff82b606992ff402d2")
@WinRTInterface("09f869b269f44aff82b606992ff402d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatSyncConfiguration.ByReference::class)
public interface IChatSyncConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSyncEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsSyncEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_RestoreHistorySpan(): ChatRestoreHistorySpan?

  @InterfaceMethod(3)
  public fun put_RestoreHistorySpan(value: ChatRestoreHistorySpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatSyncConfiguration> {
    public override fun getValue() = ABI.makeIChatSyncConfiguration(pointer.getPointer(0))

    public fun setValue(value: IChatSyncConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatSyncConfiguration {
    public val __1440845188_Ptr: Pointer?

    public val _1440845188_VtblPtr: Pointer?
      get() = __1440845188_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSyncEnabled(): Boolean {
      val fnPtr = _1440845188_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1440845188_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsSyncEnabled(value: Boolean): Unit {
      val fnPtr = _1440845188_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1440845188_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RestoreHistorySpan(): ChatRestoreHistorySpan? {
      val fnPtr = _1440845188_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatRestoreHistorySpan>()
      val hr = fn.invokeHR(arrayOf(__1440845188_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatRestoreHistorySpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RestoreHistorySpan(value: ChatRestoreHistorySpan?): Unit {
      val fnPtr = _1440845188_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1440845188_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatSyncConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1440845188_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatSyncConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09f869b269f44aff82b606992ff402d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatSyncConfiguration(ptr: Pointer?): WithDefault =
        IChatSyncConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatSyncConfiguration {
      val address = segment.toRawLongValue()
      return makeIChatSyncConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IChatSyncConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1440845188_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatSyncConfiguration): Array<IChatSyncConfiguration?> =
        (elements as
        Array<IChatSyncConfiguration?>).castToImpl<IChatSyncConfiguration,IChatSyncConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatSyncConfiguration?> =
        arrayOfNulls<IChatSyncConfiguration_Impl>(size) as Array<IChatSyncConfiguration?>
  }
}
