package Windows.Services.Store

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IStoreRequestHelperStatics.ABI::class)
@Signature("{6ce5e5f9-a0c9-4b2c-96a6-a171c630038d}")
@Guid("6ce5e5f9a0c94b2c96a6a171c630038d")
@WinRTInterface("6ce5e5f9a0c94b2c96a6a171c630038d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreRequestHelperStatics.ByReference::class)
public interface IStoreRequestHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SendRequestAsync(
    context: StoreContext?,
    requestKind: WinDef.UINT,
    parametersAsJson: String?
  ): IAsyncOperation<StoreSendRequestResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreRequestHelperStatics> {
    public override fun getValue() = ABI.makeIStoreRequestHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IStoreRequestHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreRequestHelperStatics {
    public val __1019627684_Ptr: Pointer?

    public val _1019627684_VtblPtr: Pointer?
      get() = __1019627684_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendRequestAsync(
      context: StoreContext?,
      requestKind: WinDef.UINT,
      parametersAsJson: String?
    ): IAsyncOperation<StoreSendRequestResult?>? {
      val fnPtr = _1019627684_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreSendRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__1019627684_Ptr, marshalToNative(context), requestKind,
          marshalToNative(parametersAsJson), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreSendRequestResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IStoreRequestHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1019627684_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreRequestHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ce5e5f9a0c94b2c96a6a171c630038d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreRequestHelperStatics(ptr: Pointer?): WithDefault =
        IStoreRequestHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreRequestHelperStatics {
      val address = segment.toRawLongValue()
      return makeIStoreRequestHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IStoreRequestHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1019627684_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreRequestHelperStatics):
        Array<IStoreRequestHelperStatics?> = (elements as
        Array<IStoreRequestHelperStatics?>).castToImpl<IStoreRequestHelperStatics,IStoreRequestHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreRequestHelperStatics?> =
        arrayOfNulls<IStoreRequestHelperStatics_Impl>(size) as Array<IStoreRequestHelperStatics?>
  }
}
