package Windows.Management

import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMdmSessionManagerStatics.ABI::class)
@Signature("{cf4ad959-f745-4b79-9b5c-de0bf8efe44b}")
@Guid("cf4ad959f7454b799b5cde0bf8efe44b")
@WinRTInterface("cf4ad959f7454b799b5cde0bf8efe44b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMdmSessionManagerStatics.ByReference::class)
public interface IMdmSessionManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SessionIds(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun TryCreateSession(): MdmSession?

  @InterfaceMethod(2)
  public fun DeleteSessionById(sessionId: String?): Unit

  @InterfaceMethod(3)
  public fun GetSessionById(sessionId: String?): MdmSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMdmSessionManagerStatics> {
    public override fun getValue() = ABI.makeIMdmSessionManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IMdmSessionManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMdmSessionManagerStatics {
    public val __1983058899_Ptr: Pointer?

    public val _1983058899_VtblPtr: Pointer?
      get() = __1983058899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SessionIds(): IVectorView<String?>? {
      val fnPtr = _1983058899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1983058899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryCreateSession(): MdmSession? {
      val fnPtr = _1983058899_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MdmSession>()
      val hr = fn.invokeHR(arrayOf(__1983058899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MdmSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DeleteSessionById(sessionId: String?): Unit {
      val fnPtr = _1983058899_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1983058899_Ptr, marshalToNative(sessionId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetSessionById(sessionId: String?): MdmSession? {
      val fnPtr = _1983058899_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MdmSession>()
      val hr = fn.invokeHR(arrayOf(__1983058899_Ptr, marshalToNative(sessionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MdmSession>(result.getValue())
      return resultValue
    }
  }

  public class IMdmSessionManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1983058899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMdmSessionManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf4ad959f7454b799b5cde0bf8efe44b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMdmSessionManagerStatics(ptr: Pointer?): WithDefault =
        IMdmSessionManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMdmSessionManagerStatics {
      val address = segment.toRawLongValue()
      return makeIMdmSessionManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IMdmSessionManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1983058899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMdmSessionManagerStatics):
        Array<IMdmSessionManagerStatics?> = (elements as
        Array<IMdmSessionManagerStatics?>).castToImpl<IMdmSessionManagerStatics,IMdmSessionManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMdmSessionManagerStatics?> =
        arrayOfNulls<IMdmSessionManagerStatics_Impl>(size) as Array<IMdmSessionManagerStatics?>
  }
}
