package Windows.Foundation.Diagnostics

import Windows.Foundation.Diagnostics.ILoggingChannel.ABI.IID
import Windows.Foundation.IClosable
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

@ABIMarker(ILoggingChannel2.ABI::class)
@Signature("{9f4c3cf3-0bac-45a5-9e33-baf3f3a246a5}")
@Guid("9f4c3cf30bac45a59e33baf3f3a246a5")
@WinRTInterface("9f4c3cf30bac45a59e33baf3f3a246a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingChannel2.ByReference::class)
public interface ILoggingChannel2 : NativeMapped, IWinRTInterface, ILoggingChannel, IClosable,
    ILoggingTarget {
  @InterfaceMethod(0)
  public fun get_Id(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingChannel2> {
    public override fun getValue() = ABI.makeILoggingChannel2(pointer.getPointer(0))

    public fun setValue(value: ILoggingChannel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingChannel2, ILoggingChannel.WithDefault,
      IClosable.WithDefault, ILoggingTarget.WithDefault {
    public val __571723105_Ptr: Pointer?

    public val _571723105_VtblPtr: Pointer?
      get() = __571723105_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _571723105_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__571723105_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class ILoggingChannel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ILoggingChannel, IClosable,
      ILoggingTarget {
    public override val __1958105329_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_571723105_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_571723105_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1118672925_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(ILoggingTarget.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_571723105_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __571723105_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingChannel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f4c3cf30bac45a59e33baf3f3a246a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingChannel2(ptr: Pointer?): WithDefault = ILoggingChannel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingChannel2 {
      val address = segment.toRawLongValue()
      return makeILoggingChannel2(Pointer(address))
    }

    public override fun toNative(obj: ILoggingChannel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__571723105_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingChannel2): Array<ILoggingChannel2?> = (elements as
        Array<ILoggingChannel2?>).castToImpl<ILoggingChannel2,ILoggingChannel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingChannel2?> =
        arrayOfNulls<ILoggingChannel2_Impl>(size) as Array<ILoggingChannel2?>
  }
}
