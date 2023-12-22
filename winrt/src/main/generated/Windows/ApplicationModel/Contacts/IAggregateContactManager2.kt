package Windows.ApplicationModel.Contacts

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IAggregateContactManager2.ABI::class)
@Signature("{5e8cc2d8-a9cd-4430-9c4b-01348db2ca50}")
@Guid("5e8cc2d8a9cd44309c4b01348db2ca50")
@WinRTInterface("5e8cc2d8a9cd44309c4b01348db2ca50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAggregateContactManager2.ByReference::class)
public interface IAggregateContactManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetRemoteIdentificationInformationAsync(
    contactListId: String?,
    remoteSourceId: String?,
    accountId: String?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAggregateContactManager2> {
    public override fun getValue() = ABI.makeIAggregateContactManager2(pointer.getPointer(0))

    public fun setValue(value: IAggregateContactManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAggregateContactManager2 {
    public val __495965074_Ptr: Pointer?

    public val _495965074_VtblPtr: Pointer?
      get() = __495965074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetRemoteIdentificationInformationAsync(
      contactListId: String?,
      remoteSourceId: String?,
      accountId: String?
    ): IAsyncAction? {
      val fnPtr = _495965074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__495965074_Ptr, marshalToNative(contactListId),
          marshalToNative(remoteSourceId), marshalToNative(accountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAggregateContactManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __495965074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAggregateContactManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e8cc2d8a9cd44309c4b01348db2ca50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAggregateContactManager2(ptr: Pointer?): WithDefault =
        IAggregateContactManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAggregateContactManager2 {
      val address = segment.toRawLongValue()
      return makeIAggregateContactManager2(Pointer(address))
    }

    public override fun toNative(obj: IAggregateContactManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__495965074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAggregateContactManager2):
        Array<IAggregateContactManager2?> = (elements as
        Array<IAggregateContactManager2?>).castToImpl<IAggregateContactManager2,IAggregateContactManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAggregateContactManager2?> =
        arrayOfNulls<IAggregateContactManager2_Impl>(size) as Array<IAggregateContactManager2?>
  }
}
