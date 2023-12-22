package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactListSyncManager2.ABI::class)
@Signature("{a9591247-bb55-4e23-8128-370134a85d0d}")
@Guid("a9591247bb554e238128370134a85d0d")
@WinRTInterface("a9591247bb554e238128370134a85d0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListSyncManager2.ByReference::class)
public interface IContactListSyncManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Status(value: ContactListSyncStatus?): Unit

  @InterfaceMethod(1)
  public fun put_LastSuccessfulSyncTime(value: DateTime?): Unit

  @InterfaceMethod(2)
  public fun put_LastAttemptedSyncTime(value: DateTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListSyncManager2> {
    public override fun getValue() = ABI.makeIContactListSyncManager2(pointer.getPointer(0))

    public fun setValue(value: IContactListSyncManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListSyncManager2 {
    public val __997385358_Ptr: Pointer?

    public val _997385358_VtblPtr: Pointer?
      get() = __997385358_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Status(value: ContactListSyncStatus?): Unit {
      val fnPtr = _997385358_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__997385358_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun put_LastSuccessfulSyncTime(value: DateTime?): Unit {
      val fnPtr = _997385358_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__997385358_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun put_LastAttemptedSyncTime(value: DateTime?): Unit {
      val fnPtr = _997385358_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__997385358_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactListSyncManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __997385358_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListSyncManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9591247bb554e238128370134a85d0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListSyncManager2(ptr: Pointer?): WithDefault =
        IContactListSyncManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactListSyncManager2 {
      val address = segment.toRawLongValue()
      return makeIContactListSyncManager2(Pointer(address))
    }

    public override fun toNative(obj: IContactListSyncManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__997385358_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListSyncManager2):
        Array<IContactListSyncManager2?> = (elements as
        Array<IContactListSyncManager2?>).castToImpl<IContactListSyncManager2,IContactListSyncManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListSyncManager2?> =
        arrayOfNulls<IContactListSyncManager2_Impl>(size) as Array<IContactListSyncManager2?>
  }
}
