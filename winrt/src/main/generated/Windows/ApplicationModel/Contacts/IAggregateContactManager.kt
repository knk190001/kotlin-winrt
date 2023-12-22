package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IAggregateContactManager.ABI::class)
@Signature("{0379d5dd-db5a-4fd3-b54e-4df17917a212}")
@Guid("0379d5dddb5a4fd3b54e4df17917a212")
@WinRTInterface("0379d5dddb5a4fd3b54e4df17917a212")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAggregateContactManager.ByReference::class)
public interface IAggregateContactManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindRawContactsAsync(contact: Contact?): IAsyncOperation<IVectorView<Contact?>?>?

  @InterfaceMethod(1)
  public fun TryLinkContactsAsync(primaryContact: Contact?, secondaryContact: Contact?):
      IAsyncOperation<Contact?>?

  @InterfaceMethod(2)
  public fun UnlinkRawContactAsync(contact: Contact?): IAsyncAction?

  @InterfaceMethod(3)
  public fun TrySetPreferredSourceForPictureAsync(aggregateContact: Contact?, rawContact: Contact?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAggregateContactManager> {
    public override fun getValue() = ABI.makeIAggregateContactManager(pointer.getPointer(0))

    public fun setValue(value: IAggregateContactManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAggregateContactManager {
    public val __293093536_Ptr: Pointer?

    public val _293093536_VtblPtr: Pointer?
      get() = __293093536_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindRawContactsAsync(contact: Contact?):
        IAsyncOperation<IVectorView<Contact?>?>? {
      val fnPtr = _293093536_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Contact?>?>>()
      val hr = fn.invokeHR(arrayOf(__293093536_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Contact?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryLinkContactsAsync(primaryContact: Contact?, secondaryContact: Contact?):
        IAsyncOperation<Contact?>? {
      val fnPtr = _293093536_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__293093536_Ptr, marshalToNative(primaryContact),
          marshalToNative(secondaryContact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UnlinkRawContactAsync(contact: Contact?): IAsyncAction? {
      val fnPtr = _293093536_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__293093536_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TrySetPreferredSourceForPictureAsync(aggregateContact: Contact?,
        rawContact: Contact?): IAsyncOperation<Boolean>? {
      val fnPtr = _293093536_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__293093536_Ptr, marshalToNative(aggregateContact),
          marshalToNative(rawContact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IAggregateContactManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __293093536_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAggregateContactManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0379d5dddb5a4fd3b54e4df17917a212")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAggregateContactManager(ptr: Pointer?): WithDefault =
        IAggregateContactManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAggregateContactManager {
      val address = segment.toRawLongValue()
      return makeIAggregateContactManager(Pointer(address))
    }

    public override fun toNative(obj: IAggregateContactManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__293093536_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAggregateContactManager):
        Array<IAggregateContactManager?> = (elements as
        Array<IAggregateContactManager?>).castToImpl<IAggregateContactManager,IAggregateContactManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAggregateContactManager?> =
        arrayOfNulls<IAggregateContactManager_Impl>(size) as Array<IAggregateContactManager?>
  }
}
