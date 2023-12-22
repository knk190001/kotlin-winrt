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

@ABIMarker(IChatMessage4.ABI::class)
@Signature("{2d144b0f-d2bf-460c-aa68-6d3f8483c9bf}")
@Guid("2d144b0fd2bf460caa686d3f8483c9bf")
@WinRTInterface("2d144b0fd2bf460caa686d3f8483c9bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessage4.ByReference::class)
public interface IChatMessage4 : NativeMapped, IWinRTInterface, IChatMessage {
  @InterfaceMethod(0)
  public fun get_SyncId(): String?

  @InterfaceMethod(1)
  public fun put_SyncId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IChatMessage4>
      {
    public override fun getValue() = ABI.makeIChatMessage4(pointer.getPointer(0))

    public fun setValue(value: IChatMessage4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessage4, IChatMessage.WithDefault {
    public val __1435028364_Ptr: Pointer?

    public val _1435028364_VtblPtr: Pointer?
      get() = __1435028364_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SyncId(): String? {
      val fnPtr = _1435028364_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1435028364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SyncId(value: String?): Unit {
      val fnPtr = _1435028364_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028364_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatMessage4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessage {
    public override val __184838568_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1435028364_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1435028364_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessage4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d144b0fd2bf460caa686d3f8483c9bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessage4(ptr: Pointer?): WithDefault = IChatMessage4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessage4 {
      val address = segment.toRawLongValue()
      return makeIChatMessage4(Pointer(address))
    }

    public override fun toNative(obj: IChatMessage4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1435028364_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessage4): Array<IChatMessage4?> = (elements as
        Array<IChatMessage4?>).castToImpl<IChatMessage4,IChatMessage4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessage4?> =
        arrayOfNulls<IChatMessage4_Impl>(size) as Array<IChatMessage4?>
  }
}
