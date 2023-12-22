package Windows.System

import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
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

@ABIMarker(IProcessLauncherOptions.ABI::class)
@Signature("{3080b9cf-f444-4a83-beaf-a549a0f3229c}")
@Guid("3080b9cff4444a83beafa549a0f3229c")
@WinRTInterface("3080b9cff4444a83beafa549a0f3229c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessLauncherOptions.ByReference::class)
public interface IProcessLauncherOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StandardInput(): IInputStream?

  @InterfaceMethod(1)
  public fun put_StandardInput(value: IInputStream?): Unit

  @InterfaceMethod(2)
  public fun get_StandardOutput(): IOutputStream?

  @InterfaceMethod(3)
  public fun put_StandardOutput(value: IOutputStream?): Unit

  @InterfaceMethod(4)
  public fun get_StandardError(): IOutputStream?

  @InterfaceMethod(5)
  public fun put_StandardError(value: IOutputStream?): Unit

  @InterfaceMethod(6)
  public fun get_WorkingDirectory(): String?

  @InterfaceMethod(7)
  public fun put_WorkingDirectory(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessLauncherOptions> {
    public override fun getValue() = ABI.makeIProcessLauncherOptions(pointer.getPointer(0))

    public fun setValue(value: IProcessLauncherOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessLauncherOptions {
    public val __882025118_Ptr: Pointer?

    public val _882025118_VtblPtr: Pointer?
      get() = __882025118_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StandardInput(): IInputStream? {
      val fnPtr = _882025118_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__882025118_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_StandardInput(value: IInputStream?): Unit {
      val fnPtr = _882025118_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__882025118_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StandardOutput(): IOutputStream? {
      val fnPtr = _882025118_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__882025118_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_StandardOutput(value: IOutputStream?): Unit {
      val fnPtr = _882025118_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__882025118_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StandardError(): IOutputStream? {
      val fnPtr = _882025118_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__882025118_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_StandardError(value: IOutputStream?): Unit {
      val fnPtr = _882025118_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__882025118_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_WorkingDirectory(): String? {
      val fnPtr = _882025118_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__882025118_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_WorkingDirectory(value: String?): Unit {
      val fnPtr = _882025118_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__882025118_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IProcessLauncherOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __882025118_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessLauncherOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3080b9cff4444a83beafa549a0f3229c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessLauncherOptions(ptr: Pointer?): WithDefault =
        IProcessLauncherOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessLauncherOptions {
      val address = segment.toRawLongValue()
      return makeIProcessLauncherOptions(Pointer(address))
    }

    public override fun toNative(obj: IProcessLauncherOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__882025118_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessLauncherOptions): Array<IProcessLauncherOptions?>
        = (elements as
        Array<IProcessLauncherOptions?>).castToImpl<IProcessLauncherOptions,IProcessLauncherOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessLauncherOptions?> =
        arrayOfNulls<IProcessLauncherOptions_Impl>(size) as Array<IProcessLauncherOptions?>
  }
}
