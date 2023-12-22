package Windows.ApplicationModel.Calls.Provider

import Windows.ApplicationModel.Calls.Provider.IPhoneCallOriginManagerStatics.ABI.IID
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

@ABIMarker(IPhoneCallOriginManagerStatics2.ABI::class)
@Signature("{8bf3ee3f-40f4-4380-8c7c-aea2c9b8dd7a}")
@Guid("8bf3ee3f40f443808c7caea2c9b8dd7a")
@WinRTInterface("8bf3ee3f40f443808c7caea2c9b8dd7a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallOriginManagerStatics2.ByReference::class)
public interface IPhoneCallOriginManagerStatics2 : NativeMapped, IWinRTInterface,
    IPhoneCallOriginManagerStatics {
  @InterfaceMethod(0)
  public fun RequestSetAsActiveCallOriginAppAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallOriginManagerStatics2> {
    public override fun getValue() = ABI.makeIPhoneCallOriginManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallOriginManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallOriginManagerStatics2,
      IPhoneCallOriginManagerStatics.WithDefault {
    public val __1508306205_Ptr: Pointer?

    public val _1508306205_VtblPtr: Pointer?
      get() = __1508306205_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestSetAsActiveCallOriginAppAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1508306205_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1508306205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallOriginManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPhoneCallOriginManagerStatics {
    public override val __228439627_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1508306205_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1508306205_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallOriginManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bf3ee3f40f443808c7caea2c9b8dd7a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallOriginManagerStatics2(ptr: Pointer?): WithDefault =
        IPhoneCallOriginManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallOriginManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIPhoneCallOriginManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallOriginManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1508306205_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallOriginManagerStatics2):
        Array<IPhoneCallOriginManagerStatics2?> = (elements as
        Array<IPhoneCallOriginManagerStatics2?>).castToImpl<IPhoneCallOriginManagerStatics2,IPhoneCallOriginManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallOriginManagerStatics2?> =
        arrayOfNulls<IPhoneCallOriginManagerStatics2_Impl>(size) as
        Array<IPhoneCallOriginManagerStatics2?>
  }
}
