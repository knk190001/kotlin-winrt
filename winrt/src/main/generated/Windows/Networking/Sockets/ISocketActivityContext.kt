package Windows.Networking.Sockets

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

@ABIMarker(ISocketActivityContext.ABI::class)
@Signature("{43b04d64-4c85-4396-a637-1d973f6ebd49}")
@Guid("43b04d644c854396a6371d973f6ebd49")
@WinRTInterface("43b04d644c854396a6371d973f6ebd49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocketActivityContext.ByReference::class)
public interface ISocketActivityContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocketActivityContext> {
    public override fun getValue() = ABI.makeISocketActivityContext(pointer.getPointer(0))

    public fun setValue(value: ISocketActivityContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocketActivityContext {
    public val __1017169909_Ptr: Pointer?

    public val _1017169909_VtblPtr: Pointer?
      get() = __1017169909_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _1017169909_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1017169909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class ISocketActivityContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1017169909_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocketActivityContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43b04d644c854396a6371d973f6ebd49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocketActivityContext(ptr: Pointer?): WithDefault =
        ISocketActivityContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocketActivityContext {
      val address = segment.toRawLongValue()
      return makeISocketActivityContext(Pointer(address))
    }

    public override fun toNative(obj: ISocketActivityContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1017169909_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocketActivityContext): Array<ISocketActivityContext?> =
        (elements as
        Array<ISocketActivityContext?>).castToImpl<ISocketActivityContext,ISocketActivityContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocketActivityContext?> =
        arrayOfNulls<ISocketActivityContext_Impl>(size) as Array<ISocketActivityContext?>
  }
}
