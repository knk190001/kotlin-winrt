package Windows.ApplicationModel.Email

import Windows.Foundation.DateTime
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

@ABIMarker(IEmailMailboxSyncManager2.ABI::class)
@Signature("{cd8dc97e-95c1-4f89-81b7-e6aecb6695fc}")
@Guid("cd8dc97e95c14f8981b7e6aecb6695fc")
@WinRTInterface("cd8dc97e95c14f8981b7e6aecb6695fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxSyncManager2.ByReference::class)
public interface IEmailMailboxSyncManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Status(value: EmailMailboxSyncStatus?): Unit

  @InterfaceMethod(1)
  public fun put_LastSuccessfulSyncTime(value: DateTime?): Unit

  @InterfaceMethod(2)
  public fun put_LastAttemptedSyncTime(value: DateTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxSyncManager2> {
    public override fun getValue() = ABI.makeIEmailMailboxSyncManager2(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxSyncManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxSyncManager2 {
    public val __1488727055_Ptr: Pointer?

    public val _1488727055_VtblPtr: Pointer?
      get() = __1488727055_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Status(value: EmailMailboxSyncStatus?): Unit {
      val fnPtr = _1488727055_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1488727055_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun put_LastSuccessfulSyncTime(value: DateTime?): Unit {
      val fnPtr = _1488727055_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1488727055_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun put_LastAttemptedSyncTime(value: DateTime?): Unit {
      val fnPtr = _1488727055_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1488727055_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailMailboxSyncManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1488727055_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxSyncManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd8dc97e95c14f8981b7e6aecb6695fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxSyncManager2(ptr: Pointer?): WithDefault =
        IEmailMailboxSyncManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxSyncManager2 {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxSyncManager2(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxSyncManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1488727055_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxSyncManager2):
        Array<IEmailMailboxSyncManager2?> = (elements as
        Array<IEmailMailboxSyncManager2?>).castToImpl<IEmailMailboxSyncManager2,IEmailMailboxSyncManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxSyncManager2?> =
        arrayOfNulls<IEmailMailboxSyncManager2_Impl>(size) as Array<IEmailMailboxSyncManager2?>
  }
}
