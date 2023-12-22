package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageProvider.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageProvider2.ABI::class)
@Signature("{010d1917-3404-414b-9fd7-cd44472eaa39}")
@Guid("010d19173404414b9fd7cd44472eaa39")
@WinRTInterface("010d19173404414b9fd7cd44472eaa39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProvider2.ByReference::class)
public interface IStorageProvider2 : NativeMapped, IWinRTInterface, IStorageProvider {
  @InterfaceMethod(0)
  public fun IsPropertySupportedForPartialFileAsync(propertyCanonicalName: String?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProvider2> {
    public override fun getValue() = ABI.makeIStorageProvider2(pointer.getPointer(0))

    public fun setValue(value: IStorageProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProvider2, IStorageProvider.WithDefault {
    public val __869365057_Ptr: Pointer?

    public val _869365057_VtblPtr: Pointer?
      get() = __869365057_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsPropertySupportedForPartialFileAsync(propertyCanonicalName: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _869365057_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__869365057_Ptr, marshalToNative(propertyCanonicalName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageProvider {
    public override val __1413517357_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_869365057_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __869365057_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("010d19173404414b9fd7cd44472eaa39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProvider2(ptr: Pointer?): WithDefault = IStorageProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProvider2 {
      val address = segment.toRawLongValue()
      return makeIStorageProvider2(Pointer(address))
    }

    public override fun toNative(obj: IStorageProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869365057_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProvider2): Array<IStorageProvider2?> = (elements
        as Array<IStorageProvider2?>).castToImpl<IStorageProvider2,IStorageProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProvider2?> =
        arrayOfNulls<IStorageProvider2_Impl>(size) as Array<IStorageProvider2?>
  }
}
