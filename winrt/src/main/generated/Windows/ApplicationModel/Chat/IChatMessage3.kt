package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessage.ABI.IID
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

@ABIMarker(IChatMessage3.ABI::class)
@Signature("{74eb2fb0-3ba7-459f-8e0b-e8af0febd9ad}")
@Guid("74eb2fb03ba7459f8e0be8af0febd9ad")
@WinRTInterface("74eb2fb03ba7459f8e0be8af0febd9ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessage3.ByReference::class)
public interface IChatMessage3 : NativeMapped, IWinRTInterface, IChatMessage {
  @InterfaceMethod(0)
  public fun get_RemoteId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IChatMessage3>
      {
    public override fun getValue() = ABI.makeIChatMessage3(pointer.getPointer(0))

    public fun setValue(value: IChatMessage3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessage3, IChatMessage.WithDefault {
    public val __1435028363_Ptr: Pointer?

    public val _1435028363_VtblPtr: Pointer?
      get() = __1435028363_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteId(): String? {
      val fnPtr = _1435028363_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1435028363_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessage3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessage {
    public override val __184838568_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1435028363_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1435028363_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessage3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74eb2fb03ba7459f8e0be8af0febd9ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessage3(ptr: Pointer?): WithDefault = IChatMessage3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessage3 {
      val address = segment.toRawLongValue()
      return makeIChatMessage3(Pointer(address))
    }

    public override fun toNative(obj: IChatMessage3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1435028363_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessage3): Array<IChatMessage3?> = (elements as
        Array<IChatMessage3?>).castToImpl<IChatMessage3,IChatMessage3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessage3?> =
        arrayOfNulls<IChatMessage3_Impl>(size) as Array<IChatMessage3?>
  }
}
