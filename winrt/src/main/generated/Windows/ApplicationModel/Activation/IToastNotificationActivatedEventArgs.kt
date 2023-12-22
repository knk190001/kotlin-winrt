package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IToastNotificationActivatedEventArgs.ABI::class)
@Signature("{92a86f82-5290-431d-be85-c4aaeeb8685f}")
@Guid("92a86f825290431dbe85c4aaeeb8685f")
@WinRTInterface("92a86f825290431dbe85c4aaeeb8685f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationActivatedEventArgs.ByReference::class)
public interface IToastNotificationActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Argument(): String?

  @InterfaceMethod(1)
  public fun get_UserInput(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIToastNotificationActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationActivatedEventArgs,
      IActivatedEventArgs.WithDefault {
    public val __2097851281_Ptr: Pointer?

    public val _2097851281_VtblPtr: Pointer?
      get() = __2097851281_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Argument(): String? {
      val fnPtr = _2097851281_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2097851281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UserInput(): ValueSet? {
      val fnPtr = _2097851281_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__2097851281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2097851281_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2097851281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92a86f825290431dbe85c4aaeeb8685f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationActivatedEventArgs(ptr: Pointer?): WithDefault =
        IToastNotificationActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIToastNotificationActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2097851281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationActivatedEventArgs):
        Array<IToastNotificationActivatedEventArgs?> = (elements as
        Array<IToastNotificationActivatedEventArgs?>).castToImpl<IToastNotificationActivatedEventArgs,IToastNotificationActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationActivatedEventArgs?> =
        arrayOfNulls<IToastNotificationActivatedEventArgs_Impl>(size) as
        Array<IToastNotificationActivatedEventArgs?>
  }
}
