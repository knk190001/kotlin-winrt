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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallActivatedEventArgs.ABI::class)
@Signature("{54615221-a3c1-4ced-b62f-8c60523619ad}")
@Guid("54615221a3c14cedb62f8c60523619ad")
@WinRTInterface("54615221a3c14cedb62f8c60523619ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallActivatedEventArgs.ByReference::class)
public interface IPhoneCallActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallActivatedEventArgs> {
    public override fun getValue() = ABI.makeIPhoneCallActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __1025316137_Ptr: Pointer?

    public val _1025316137_VtblPtr: Pointer?
      get() = __1025316137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1025316137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1025316137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1025316137_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1025316137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54615221a3c14cedb62f8c60523619ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallActivatedEventArgs(ptr: Pointer?): WithDefault =
        IPhoneCallActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPhoneCallActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1025316137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallActivatedEventArgs):
        Array<IPhoneCallActivatedEventArgs?> = (elements as
        Array<IPhoneCallActivatedEventArgs?>).castToImpl<IPhoneCallActivatedEventArgs,IPhoneCallActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallActivatedEventArgs?> =
        arrayOfNulls<IPhoneCallActivatedEventArgs_Impl>(size) as
        Array<IPhoneCallActivatedEventArgs?>
  }
}
