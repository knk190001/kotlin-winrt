package Windows.Networking.Sockets

import Windows.Foundation.Collections.IVector
import Windows.Networking.Sockets.IWebSocketControl.ABI.IID
import Windows.Security.Cryptography.Certificates.ChainValidationResult
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

@ABIMarker(IWebSocketControl2.ABI::class)
@Signature("{79c3be03-f2ca-461e-af4e-9665bc2d0620}")
@Guid("79c3be03f2ca461eaf4e9665bc2d0620")
@WinRTInterface("79c3be03f2ca461eaf4e9665bc2d0620")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebSocketControl2.ByReference::class)
public interface IWebSocketControl2 : NativeMapped, IWinRTInterface, IWebSocketControl {
  @InterfaceMethod(0)
  public fun get_IgnorableServerCertificateErrors(): IVector<ChainValidationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebSocketControl2> {
    public override fun getValue() = ABI.makeIWebSocketControl2(pointer.getPointer(0))

    public fun setValue(value: IWebSocketControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebSocketControl2, IWebSocketControl.WithDefault {
    public val __49383364_Ptr: Pointer?

    public val _49383364_VtblPtr: Pointer?
      get() = __49383364_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IgnorableServerCertificateErrors(): IVector<ChainValidationResult?>? {
      val fnPtr = _49383364_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ChainValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__49383364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ChainValidationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebSocketControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebSocketControl {
    public override val __136954322_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_49383364_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __49383364_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebSocketControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79c3be03f2ca461eaf4e9665bc2d0620")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebSocketControl2(ptr: Pointer?): WithDefault = IWebSocketControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebSocketControl2 {
      val address = segment.toRawLongValue()
      return makeIWebSocketControl2(Pointer(address))
    }

    public override fun toNative(obj: IWebSocketControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__49383364_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebSocketControl2): Array<IWebSocketControl2?> =
        (elements as
        Array<IWebSocketControl2?>).castToImpl<IWebSocketControl2,IWebSocketControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebSocketControl2?> =
        arrayOfNulls<IWebSocketControl2_Impl>(size) as Array<IWebSocketControl2?>
  }
}
