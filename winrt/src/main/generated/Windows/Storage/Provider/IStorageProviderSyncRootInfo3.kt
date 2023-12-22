package Windows.Storage.Provider

import Windows.Foundation.Collections.IVector
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageProviderSyncRootInfo3.ABI::class)
@Signature("{507a6617-bef6-56fd-855e-75ace2e45cf5}")
@Guid("507a6617bef656fd855e75ace2e45cf5")
@WinRTInterface("507a6617bef656fd855e75ace2e45cf5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderSyncRootInfo3.ByReference::class)
public interface IStorageProviderSyncRootInfo3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FallbackFileTypeInfo(): IVector<StorageProviderFileTypeInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderSyncRootInfo3> {
    public override fun getValue() = ABI.makeIStorageProviderSyncRootInfo3(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderSyncRootInfo3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderSyncRootInfo3 {
    public val __68114986_Ptr: Pointer?

    public val _68114986_VtblPtr: Pointer?
      get() = __68114986_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FallbackFileTypeInfo(): IVector<StorageProviderFileTypeInfo?>? {
      val fnPtr = _68114986_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<StorageProviderFileTypeInfo?>>()
      val hr = fn.invokeHR(arrayOf(__68114986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<StorageProviderFileTypeInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderSyncRootInfo3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __68114986_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderSyncRootInfo3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("507a6617bef656fd855e75ace2e45cf5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderSyncRootInfo3(ptr: Pointer?): WithDefault =
        IStorageProviderSyncRootInfo3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderSyncRootInfo3 {
      val address = segment.toRawLongValue()
      return makeIStorageProviderSyncRootInfo3(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderSyncRootInfo3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__68114986_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderSyncRootInfo3):
        Array<IStorageProviderSyncRootInfo3?> = (elements as
        Array<IStorageProviderSyncRootInfo3?>).castToImpl<IStorageProviderSyncRootInfo3,IStorageProviderSyncRootInfo3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderSyncRootInfo3?> =
        arrayOfNulls<IStorageProviderSyncRootInfo3_Impl>(size) as
        Array<IStorageProviderSyncRootInfo3?>
  }
}
