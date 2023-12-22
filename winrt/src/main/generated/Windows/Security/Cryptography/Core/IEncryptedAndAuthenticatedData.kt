package Windows.Security.Cryptography.Core

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IEncryptedAndAuthenticatedData.ABI::class)
@Signature("{6fa42fe7-1ecb-4b00-bea5-60b83f862f17}")
@Guid("6fa42fe71ecb4b00bea560b83f862f17")
@WinRTInterface("6fa42fe71ecb4b00bea560b83f862f17")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEncryptedAndAuthenticatedData.ByReference::class)
public interface IEncryptedAndAuthenticatedData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EncryptedData(): IBuffer?

  @InterfaceMethod(1)
  public fun get_AuthenticationTag(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEncryptedAndAuthenticatedData> {
    public override fun getValue() = ABI.makeIEncryptedAndAuthenticatedData(pointer.getPointer(0))

    public fun setValue(value: IEncryptedAndAuthenticatedData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEncryptedAndAuthenticatedData {
    public val __1314663867_Ptr: Pointer?

    public val _1314663867_VtblPtr: Pointer?
      get() = __1314663867_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncryptedData(): IBuffer? {
      val fnPtr = _1314663867_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1314663867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AuthenticationTag(): IBuffer? {
      val fnPtr = _1314663867_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1314663867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IEncryptedAndAuthenticatedData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314663867_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEncryptedAndAuthenticatedData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6fa42fe71ecb4b00bea560b83f862f17")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEncryptedAndAuthenticatedData(ptr: Pointer?): WithDefault =
        IEncryptedAndAuthenticatedData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEncryptedAndAuthenticatedData {
      val address = segment.toRawLongValue()
      return makeIEncryptedAndAuthenticatedData(Pointer(address))
    }

    public override fun toNative(obj: IEncryptedAndAuthenticatedData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314663867_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEncryptedAndAuthenticatedData):
        Array<IEncryptedAndAuthenticatedData?> = (elements as
        Array<IEncryptedAndAuthenticatedData?>).castToImpl<IEncryptedAndAuthenticatedData,IEncryptedAndAuthenticatedData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEncryptedAndAuthenticatedData?> =
        arrayOfNulls<IEncryptedAndAuthenticatedData_Impl>(size) as
        Array<IEncryptedAndAuthenticatedData?>
  }
}
