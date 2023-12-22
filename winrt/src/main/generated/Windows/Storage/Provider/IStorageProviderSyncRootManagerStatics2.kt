package Windows.Storage.Provider

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageProviderSyncRootManagerStatics2.ABI::class)
@Signature("{efb6cfee-1374-544e-9df1-5598d2e9cfdd}")
@Guid("efb6cfee1374544e9df15598d2e9cfdd")
@WinRTInterface("efb6cfee1374544e9df15598d2e9cfdd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderSyncRootManagerStatics2.ByReference::class)
public interface IStorageProviderSyncRootManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderSyncRootManagerStatics2> {
    public override fun getValue() =
        ABI.makeIStorageProviderSyncRootManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderSyncRootManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderSyncRootManagerStatics2 {
    public val __1640684757_Ptr: Pointer?

    public val _1640684757_VtblPtr: Pointer?
      get() = __1640684757_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1640684757_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1640684757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageProviderSyncRootManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1640684757_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderSyncRootManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efb6cfee1374544e9df15598d2e9cfdd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderSyncRootManagerStatics2(ptr: Pointer?): WithDefault =
        IStorageProviderSyncRootManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IStorageProviderSyncRootManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIStorageProviderSyncRootManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderSyncRootManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1640684757_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderSyncRootManagerStatics2):
        Array<IStorageProviderSyncRootManagerStatics2?> = (elements as
        Array<IStorageProviderSyncRootManagerStatics2?>).castToImpl<IStorageProviderSyncRootManagerStatics2,IStorageProviderSyncRootManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderSyncRootManagerStatics2?> =
        arrayOfNulls<IStorageProviderSyncRootManagerStatics2_Impl>(size) as
        Array<IStorageProviderSyncRootManagerStatics2?>
  }
}
