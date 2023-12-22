package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
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

@ABIMarker(IStartupTaskActivatedEventArgs.ABI::class)
@Signature("{03b11a58-5276-4d91-8621-54611864d5fa}")
@Guid("03b11a5852764d91862154611864d5fa")
@WinRTInterface("03b11a5852764d91862154611864d5fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStartupTaskActivatedEventArgs.ByReference::class)
public interface IStartupTaskActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs
    {
  @InterfaceMethod(0)
  public fun get_TaskId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStartupTaskActivatedEventArgs> {
    public override fun getValue() = ABI.makeIStartupTaskActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IStartupTaskActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStartupTaskActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __982402401_Ptr: Pointer?

    public val _982402401_VtblPtr: Pointer?
      get() = __982402401_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskId(): String? {
      val fnPtr = _982402401_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__982402401_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStartupTaskActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_982402401_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __982402401_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStartupTaskActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03b11a5852764d91862154611864d5fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStartupTaskActivatedEventArgs(ptr: Pointer?): WithDefault =
        IStartupTaskActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStartupTaskActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIStartupTaskActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IStartupTaskActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__982402401_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStartupTaskActivatedEventArgs):
        Array<IStartupTaskActivatedEventArgs?> = (elements as
        Array<IStartupTaskActivatedEventArgs?>).castToImpl<IStartupTaskActivatedEventArgs,IStartupTaskActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStartupTaskActivatedEventArgs?> =
        arrayOfNulls<IStartupTaskActivatedEventArgs_Impl>(size) as
        Array<IStartupTaskActivatedEventArgs?>
  }
}
