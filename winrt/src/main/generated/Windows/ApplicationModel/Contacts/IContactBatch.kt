package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IContactBatch.ABI::class)
@Signature("{35d1972d-bfce-46bb-93f8-a5b06ec5e201}")
@Guid("35d1972dbfce46bb93f8a5b06ec5e201")
@WinRTInterface("35d1972dbfce46bb93f8a5b06ec5e201")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactBatch.ByReference::class)
public interface IContactBatch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Contacts(): IVectorView<Contact?>?

  @InterfaceMethod(1)
  public fun get_Status(): ContactBatchStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactBatch>
      {
    public override fun getValue() = ABI.makeIContactBatch(pointer.getPointer(0))

    public fun setValue(value: IContactBatch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactBatch {
    public val __1329448474_Ptr: Pointer?

    public val _1329448474_VtblPtr: Pointer?
      get() = __1329448474_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Contacts(): IVectorView<Contact?>? {
      val fnPtr = _1329448474_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__1329448474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Contact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): ContactBatchStatus? {
      val fnPtr = _1329448474_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactBatchStatus>()
      val hr = fn.invokeHR(arrayOf(__1329448474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactBatchStatus>(result.getValue())
      return resultValue
    }
  }

  public class IContactBatch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1329448474_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactBatch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35d1972dbfce46bb93f8a5b06ec5e201")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactBatch(ptr: Pointer?): WithDefault = IContactBatch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactBatch {
      val address = segment.toRawLongValue()
      return makeIContactBatch(Pointer(address))
    }

    public override fun toNative(obj: IContactBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1329448474_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactBatch): Array<IContactBatch?> = (elements as
        Array<IContactBatch?>).castToImpl<IContactBatch,IContactBatch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactBatch?> =
        arrayOfNulls<IContactBatch_Impl>(size) as Array<IContactBatch?>
  }
}
