package Windows.Security.Credentials

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Security.Credentials.IWebAccount.ABI.IID
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IWebAccount2.ABI::class)
@Signature("{7b56d6f8-990b-4eb5-94a7-5621f3a8b824}")
@Guid("7b56d6f8990b4eb594a75621f3a8b824")
@WinRTInterface("7b56d6f8990b4eb594a75621f3a8b824")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccount2.ByReference::class)
public interface IWebAccount2 : NativeMapped, IWinRTInterface, IWebAccount {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, String?>?

  @InterfaceMethod(2)
  public fun GetPictureAsync(desizedSize: WebAccountPictureSize?):
      IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(3)
  public fun SignOutAsync(): IAsyncAction?

  @InterfaceMethod(4)
  public fun SignOutAsync(clientId: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebAccount2> {
    public override fun getValue() = ABI.makeIWebAccount2(pointer.getPointer(0))

    public fun setValue(value: IWebAccount2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccount2, IWebAccount.WithDefault {
    public val __417764745_Ptr: Pointer?

    public val _417764745_VtblPtr: Pointer?
      get() = __417764745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _417764745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__417764745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, String?>? {
      val fnPtr = _417764745_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__417764745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetPictureAsync(desizedSize: WebAccountPictureSize?):
        IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _417764745_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__417764745_Ptr, marshalToNative(desizedSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SignOutAsync(): IAsyncAction? {
      val fnPtr = _417764745_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__417764745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SignOutAsync(clientId: String?): IAsyncAction? {
      val fnPtr = _417764745_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__417764745_Ptr, marshalToNative(clientId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccount2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebAccount {
    public override val __567665609_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_417764745_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __417764745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccount2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b56d6f8990b4eb594a75621f3a8b824")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccount2(ptr: Pointer?): WithDefault = IWebAccount2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccount2 {
      val address = segment.toRawLongValue()
      return makeIWebAccount2(Pointer(address))
    }

    public override fun toNative(obj: IWebAccount2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__417764745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccount2): Array<IWebAccount2?> = (elements as
        Array<IWebAccount2?>).castToImpl<IWebAccount2,IWebAccount2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccount2?> =
        arrayOfNulls<IWebAccount2_Impl>(size) as Array<IWebAccount2?>
  }
}
