package Windows.ApplicationModel.Activation

import Windows.Foundation.Deferral
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

@ABIMarker(ICommandLineActivationOperation.ABI::class)
@Signature("{994b2841-c59e-4f69-bcfd-b61ed4e622eb}")
@Guid("994b2841c59e4f69bcfdb61ed4e622eb")
@WinRTInterface("994b2841c59e4f69bcfdb61ed4e622eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandLineActivationOperation.ByReference::class)
public interface ICommandLineActivationOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Arguments(): String?

  @InterfaceMethod(1)
  public fun get_CurrentDirectoryPath(): String?

  @InterfaceMethod(2)
  public fun put_ExitCode(value: Int): Unit

  @InterfaceMethod(3)
  public fun get_ExitCode(): Int

  @InterfaceMethod(4)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandLineActivationOperation> {
    public override fun getValue() = ABI.makeICommandLineActivationOperation(pointer.getPointer(0))

    public fun setValue(value: ICommandLineActivationOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandLineActivationOperation {
    public val __2032849445_Ptr: Pointer?

    public val _2032849445_VtblPtr: Pointer?
      get() = __2032849445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Arguments(): String? {
      val fnPtr = _2032849445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2032849445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CurrentDirectoryPath(): String? {
      val fnPtr = _2032849445_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2032849445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ExitCode(value: Int): Unit {
      val fnPtr = _2032849445_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2032849445_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ExitCode(): Int {
      val fnPtr = _2032849445_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2032849445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _2032849445_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__2032849445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICommandLineActivationOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2032849445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandLineActivationOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("994b2841c59e4f69bcfdb61ed4e622eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandLineActivationOperation(ptr: Pointer?): WithDefault =
        ICommandLineActivationOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandLineActivationOperation {
      val address = segment.toRawLongValue()
      return makeICommandLineActivationOperation(Pointer(address))
    }

    public override fun toNative(obj: ICommandLineActivationOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2032849445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandLineActivationOperation):
        Array<ICommandLineActivationOperation?> = (elements as
        Array<ICommandLineActivationOperation?>).castToImpl<ICommandLineActivationOperation,ICommandLineActivationOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandLineActivationOperation?> =
        arrayOfNulls<ICommandLineActivationOperation_Impl>(size) as
        Array<ICommandLineActivationOperation?>
  }
}
