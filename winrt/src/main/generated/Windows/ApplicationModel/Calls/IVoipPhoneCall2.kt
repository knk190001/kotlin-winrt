package Windows.ApplicationModel.Calls

import Windows.ApplicationModel.Calls.IVoipPhoneCall.ABI.IID
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

@ABIMarker(IVoipPhoneCall2.ABI::class)
@Signature("{741b46e1-245f-41f3-9399-3141d25b52e3}")
@Guid("741b46e1245f41f393993141d25b52e3")
@WinRTInterface("741b46e1245f41f393993141d25b52e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoipPhoneCall2.ByReference::class)
public interface IVoipPhoneCall2 : NativeMapped, IWinRTInterface, IVoipPhoneCall {
  @InterfaceMethod(0)
  public fun TryShowAppUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoipPhoneCall2> {
    public override fun getValue() = ABI.makeIVoipPhoneCall2(pointer.getPointer(0))

    public fun setValue(value: IVoipPhoneCall2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoipPhoneCall2, IVoipPhoneCall.WithDefault {
    public val __157940604_Ptr: Pointer?

    public val _157940604_VtblPtr: Pointer?
      get() = __157940604_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryShowAppUI(): Unit {
      val fnPtr = _157940604_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__157940604_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVoipPhoneCall2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVoipPhoneCall {
    public override val __1934567790_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_157940604_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __157940604_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoipPhoneCall2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("741b46e1245f41f393993141d25b52e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoipPhoneCall2(ptr: Pointer?): WithDefault = IVoipPhoneCall2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoipPhoneCall2 {
      val address = segment.toRawLongValue()
      return makeIVoipPhoneCall2(Pointer(address))
    }

    public override fun toNative(obj: IVoipPhoneCall2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__157940604_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoipPhoneCall2): Array<IVoipPhoneCall2?> = (elements as
        Array<IVoipPhoneCall2?>).castToImpl<IVoipPhoneCall2,IVoipPhoneCall2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoipPhoneCall2?> =
        arrayOfNulls<IVoipPhoneCall2_Impl>(size) as Array<IVoipPhoneCall2?>
  }
}
