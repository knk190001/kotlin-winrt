package Windows.ApplicationModel.CommunicationBlocking

import Windows.ApplicationModel.CommunicationBlocking.ICommunicationBlockingAppManagerStatics.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICommunicationBlockingAppManagerStatics2.ABI::class)
@Signature("{14a68edd-ed88-457a-a364-a3634d6f166d}")
@Guid("14a68edded88457aa364a3634d6f166d")
@WinRTInterface("14a68edded88457aa364a3634d6f166d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommunicationBlockingAppManagerStatics2.ByReference::class)
public interface ICommunicationBlockingAppManagerStatics2 : NativeMapped, IWinRTInterface,
    ICommunicationBlockingAppManagerStatics {
  @InterfaceMethod(0)
  public fun RequestSetAsActiveBlockingAppAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommunicationBlockingAppManagerStatics2> {
    public override fun getValue() =
        ABI.makeICommunicationBlockingAppManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: ICommunicationBlockingAppManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommunicationBlockingAppManagerStatics2,
      ICommunicationBlockingAppManagerStatics.WithDefault {
    public val __46200036_Ptr: Pointer?

    public val _46200036_VtblPtr: Pointer?
      get() = __46200036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestSetAsActiveBlockingAppAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _46200036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__46200036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ICommunicationBlockingAppManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ICommunicationBlockingAppManagerStatics {
    public override val __694226986_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_46200036_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __46200036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommunicationBlockingAppManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14a68edded88457aa364a3634d6f166d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommunicationBlockingAppManagerStatics2(ptr: Pointer?): WithDefault =
        ICommunicationBlockingAppManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICommunicationBlockingAppManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeICommunicationBlockingAppManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICommunicationBlockingAppManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__46200036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommunicationBlockingAppManagerStatics2):
        Array<ICommunicationBlockingAppManagerStatics2?> = (elements as
        Array<ICommunicationBlockingAppManagerStatics2?>).castToImpl<ICommunicationBlockingAppManagerStatics2,ICommunicationBlockingAppManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommunicationBlockingAppManagerStatics2?> =
        arrayOfNulls<ICommunicationBlockingAppManagerStatics2_Impl>(size) as
        Array<ICommunicationBlockingAppManagerStatics2?>
  }
}
