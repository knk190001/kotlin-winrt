package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactManagerStatics.ABI.IID
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IContactManagerStatics2.ABI::class)
@Signature("{a178e620-47d8-48cc-963c-9592b6e510c6}")
@Guid("a178e62047d848cc963c9592b6e510c6")
@WinRTInterface("a178e62047d848cc963c9592b6e510c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactManagerStatics2.ByReference::class)
public interface IContactManagerStatics2 : NativeMapped, IWinRTInterface, IContactManagerStatics {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(): IAsyncOperation<ContactStore?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactManagerStatics2> {
    public override fun getValue() = ABI.makeIContactManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IContactManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactManagerStatics2, IContactManagerStatics.WithDefault {
    public val __847014790_Ptr: Pointer?

    public val _847014790_VtblPtr: Pointer?
      get() = __847014790_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(): IAsyncOperation<ContactStore?>? {
      val fnPtr = _847014790_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactStore?>>()
      val hr = fn.invokeHR(arrayOf(__847014790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactStore?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactManagerStatics {
    public override val __111224276_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_847014790_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __847014790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a178e62047d848cc963c9592b6e510c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactManagerStatics2(ptr: Pointer?): WithDefault =
        IContactManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIContactManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IContactManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__847014790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactManagerStatics2): Array<IContactManagerStatics2?>
        = (elements as
        Array<IContactManagerStatics2?>).castToImpl<IContactManagerStatics2,IContactManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactManagerStatics2?> =
        arrayOfNulls<IContactManagerStatics2_Impl>(size) as Array<IContactManagerStatics2?>
  }
}
