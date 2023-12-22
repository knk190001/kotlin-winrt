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

@ABIMarker(IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData.ABI::class)
@Signature("{d84a0c12-5c8f-438c-83cb-c28fcc0b2fdb}")
@Guid("d84a0c125c8f438c83cbc28fcc0b2fdb")
@WinRTInterface("d84a0c125c8f438c83cbc28fcc0b2fdb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData.ByReference::class)
public interface IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData : NativeMapped,
    IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_CallerPackageFamilyName(): String?

  @InterfaceMethod(1)
  public fun get_Data(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData> {
    public override fun getValue() =
        ABI.makeIProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData(pointer.getPointer(0))

    public fun setValue(value: IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData,
      IActivatedEventArgs.WithDefault {
    public val __2110665436_Ptr: Pointer?

    public val _2110665436_VtblPtr: Pointer?
      get() = __2110665436_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CallerPackageFamilyName(): String? {
      val fnPtr = _2110665436_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2110665436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Data(): ValueSet? {
      val fnPtr = _2110665436_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__2110665436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2110665436_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2110665436_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d84a0c125c8f438c83cbc28fcc0b2fdb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData(ptr: Pointer?):
        WithDefault = IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData {
      val address = segment.toRawLongValue()
      return makeIProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData(Pointer(address))
    }

    public override
        fun toNative(obj: IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2110665436_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData):
        Array<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData?> = (elements as
        Array<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData?>).castToImpl<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData,IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData?> =
        arrayOfNulls<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData_Impl>(size) as
        Array<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData?>
  }
}
