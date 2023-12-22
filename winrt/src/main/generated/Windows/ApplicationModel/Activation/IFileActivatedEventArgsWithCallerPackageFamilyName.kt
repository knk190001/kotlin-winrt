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

@ABIMarker(IFileActivatedEventArgsWithCallerPackageFamilyName.ABI::class)
@Signature("{2d60f06b-d25f-4d25-8653-e1c5e1108309}")
@Guid("2d60f06bd25f4d258653e1c5e1108309")
@WinRTInterface("2d60f06bd25f4d258653e1c5e1108309")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileActivatedEventArgsWithCallerPackageFamilyName.ByReference::class)
public interface IFileActivatedEventArgsWithCallerPackageFamilyName : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_CallerPackageFamilyName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileActivatedEventArgsWithCallerPackageFamilyName> {
    public override fun getValue() =
        ABI.makeIFileActivatedEventArgsWithCallerPackageFamilyName(pointer.getPointer(0))

    public fun setValue(value: IFileActivatedEventArgsWithCallerPackageFamilyName_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileActivatedEventArgsWithCallerPackageFamilyName,
      IActivatedEventArgs.WithDefault {
    public val __650955431_Ptr: Pointer?

    public val _650955431_VtblPtr: Pointer?
      get() = __650955431_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CallerPackageFamilyName(): String? {
      val fnPtr = _650955431_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__650955431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IFileActivatedEventArgsWithCallerPackageFamilyName_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_650955431_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __650955431_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileActivatedEventArgsWithCallerPackageFamilyName, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d60f06bd25f4d258653e1c5e1108309")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileActivatedEventArgsWithCallerPackageFamilyName(ptr: Pointer?): WithDefault =
        IFileActivatedEventArgsWithCallerPackageFamilyName_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IFileActivatedEventArgsWithCallerPackageFamilyName {
      val address = segment.toRawLongValue()
      return makeIFileActivatedEventArgsWithCallerPackageFamilyName(Pointer(address))
    }

    public override fun toNative(obj: IFileActivatedEventArgsWithCallerPackageFamilyName):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__650955431_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileActivatedEventArgsWithCallerPackageFamilyName):
        Array<IFileActivatedEventArgsWithCallerPackageFamilyName?> = (elements as
        Array<IFileActivatedEventArgsWithCallerPackageFamilyName?>).castToImpl<IFileActivatedEventArgsWithCallerPackageFamilyName,IFileActivatedEventArgsWithCallerPackageFamilyName_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IFileActivatedEventArgsWithCallerPackageFamilyName?> =
        arrayOfNulls<IFileActivatedEventArgsWithCallerPackageFamilyName_Impl>(size) as
        Array<IFileActivatedEventArgsWithCallerPackageFamilyName?>
  }
}
