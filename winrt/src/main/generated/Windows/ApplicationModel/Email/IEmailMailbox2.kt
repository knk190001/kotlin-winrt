package Windows.ApplicationModel.Email

import Windows.ApplicationModel.Email.IEmailMailbox.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailMailbox2.ABI::class)
@Signature("{14f8e404-6ca2-4ab2-9241-79cd7bf46346}")
@Guid("14f8e4046ca24ab2924179cd7bf46346")
@WinRTInterface("14f8e4046ca24ab2924179cd7bf46346")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailbox2.ByReference::class)
public interface IEmailMailbox2 : NativeMapped, IWinRTInterface, IEmailMailbox {
  @InterfaceMethod(0)
  public fun get_LinkedMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_NetworkAccountId(): String?

  @InterfaceMethod(2)
  public fun get_NetworkId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMailbox2>
      {
    public override fun getValue() = ABI.makeIEmailMailbox2(pointer.getPointer(0))

    public fun setValue(value: IEmailMailbox2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailbox2, IEmailMailbox.WithDefault {
    public val __817367677_Ptr: Pointer?

    public val _817367677_VtblPtr: Pointer?
      get() = __817367677_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LinkedMailboxId(): String? {
      val fnPtr = _817367677_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__817367677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NetworkAccountId(): String? {
      val fnPtr = _817367677_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__817367677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NetworkId(): String? {
      val fnPtr = _817367677_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__817367677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailbox2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IEmailMailbox {
    public override val __164914033_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_817367677_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __817367677_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailbox2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14f8e4046ca24ab2924179cd7bf46346")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailbox2(ptr: Pointer?): WithDefault = IEmailMailbox2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailbox2 {
      val address = segment.toRawLongValue()
      return makeIEmailMailbox2(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailbox2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__817367677_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailbox2): Array<IEmailMailbox2?> = (elements as
        Array<IEmailMailbox2?>).castToImpl<IEmailMailbox2,IEmailMailbox2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailbox2?> =
        arrayOfNulls<IEmailMailbox2_Impl>(size) as Array<IEmailMailbox2?>
  }
}
