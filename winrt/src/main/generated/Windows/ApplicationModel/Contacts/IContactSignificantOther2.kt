package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactSignificantOther.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IContactSignificantOther2.ABI::class)
@Signature("{8d7bd474-3f03-45f8-ba0f-c4ed37d64219}")
@Guid("8d7bd4743f0345f8ba0fc4ed37d64219")
@WinRTInterface("8d7bd4743f0345f8ba0fc4ed37d64219")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactSignificantOther2.ByReference::class)
public interface IContactSignificantOther2 : NativeMapped, IWinRTInterface, IContactSignificantOther
    {
  @InterfaceMethod(0)
  public fun get_Relationship(): ContactRelationship?

  @InterfaceMethod(1)
  public fun put_Relationship(value: ContactRelationship?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactSignificantOther2> {
    public override fun getValue() = ABI.makeIContactSignificantOther2(pointer.getPointer(0))

    public fun setValue(value: IContactSignificantOther2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactSignificantOther2, IContactSignificantOther.WithDefault {
    public val __2146829087_Ptr: Pointer?

    public val _2146829087_VtblPtr: Pointer?
      get() = __2146829087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Relationship(): ContactRelationship? {
      val fnPtr = _2146829087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactRelationship>()
      val hr = fn.invokeHR(arrayOf(__2146829087_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactRelationship>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Relationship(value: ContactRelationship?): Unit {
      val fnPtr = _2146829087_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2146829087_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactSignificantOther2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactSignificantOther {
    public override val __1870410097_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2146829087_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2146829087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactSignificantOther2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d7bd4743f0345f8ba0fc4ed37d64219")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactSignificantOther2(ptr: Pointer?): WithDefault =
        IContactSignificantOther2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactSignificantOther2 {
      val address = segment.toRawLongValue()
      return makeIContactSignificantOther2(Pointer(address))
    }

    public override fun toNative(obj: IContactSignificantOther2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2146829087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactSignificantOther2):
        Array<IContactSignificantOther2?> = (elements as
        Array<IContactSignificantOther2?>).castToImpl<IContactSignificantOther2,IContactSignificantOther2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactSignificantOther2?> =
        arrayOfNulls<IContactSignificantOther2_Impl>(size) as Array<IContactSignificantOther2?>
  }
}
