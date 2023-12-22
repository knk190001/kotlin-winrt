package Windows.Storage

import Windows.Storage.IStorageItemProperties.ABI.IID
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

@ABIMarker(IStorageItemPropertiesWithProvider.ABI::class)
@Signature("{861bf39b-6368-4dee-b40e-74684a5ce714}")
@Guid("861bf39b63684deeb40e74684a5ce714")
@WinRTInterface("861bf39b63684deeb40e74684a5ce714")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemPropertiesWithProvider.ByReference::class)
public interface IStorageItemPropertiesWithProvider : NativeMapped, IWinRTInterface,
    IStorageItemProperties {
  @InterfaceMethod(0)
  public fun get_Provider(): StorageProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemPropertiesWithProvider> {
    public override fun getValue() =
        ABI.makeIStorageItemPropertiesWithProvider(pointer.getPointer(0))

    public fun setValue(value: IStorageItemPropertiesWithProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemPropertiesWithProvider,
      IStorageItemProperties.WithDefault {
    public val __190620161_Ptr: Pointer?

    public val _190620161_VtblPtr: Pointer?
      get() = __190620161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Provider(): StorageProvider? {
      val fnPtr = _190620161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProvider>()
      val hr = fn.invokeHR(arrayOf(__190620161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProvider>(result.getValue())
      return resultValue
    }
  }

  public class IStorageItemPropertiesWithProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItemProperties {
    public override val __850042616_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_190620161_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __190620161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemPropertiesWithProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("861bf39b63684deeb40e74684a5ce714")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemPropertiesWithProvider(ptr: Pointer?): WithDefault =
        IStorageItemPropertiesWithProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemPropertiesWithProvider {
      val address = segment.toRawLongValue()
      return makeIStorageItemPropertiesWithProvider(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemPropertiesWithProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__190620161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemPropertiesWithProvider):
        Array<IStorageItemPropertiesWithProvider?> = (elements as
        Array<IStorageItemPropertiesWithProvider?>).castToImpl<IStorageItemPropertiesWithProvider,IStorageItemPropertiesWithProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemPropertiesWithProvider?> =
        arrayOfNulls<IStorageItemPropertiesWithProvider_Impl>(size) as
        Array<IStorageItemPropertiesWithProvider?>
  }
}
