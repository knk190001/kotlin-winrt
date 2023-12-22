package Microsoft.UI.Xaml.Input

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IStandardUICommandFactory.ABI::class)
@Signature("{5800f099-3746-5bcf-b1ce-af3d6bf8e83f}")
@Guid("5800f09937465bcfb1ceaf3d6bf8e83f")
@WinRTInterface("5800f09937465bcfb1ceaf3d6bf8e83f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardUICommandFactory.ByReference::class)
public interface IStandardUICommandFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): StandardUICommand?

  @InterfaceMethod(1)
  public fun CreateInstanceWithKind(
    kind: StandardUICommandKind?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): StandardUICommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardUICommandFactory> {
    public override fun getValue() = ABI.makeIStandardUICommandFactory(pointer.getPointer(0))

    public fun setValue(value: IStandardUICommandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardUICommandFactory {
    public val __2104316859_Ptr: Pointer?

    public val _2104316859_VtblPtr: Pointer?
      get() = __2104316859_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        StandardUICommand? {
      val fnPtr = _2104316859_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StandardUICommand>()
      val hr = fn.invokeHR(arrayOf(__2104316859_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StandardUICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithKind(
      kind: StandardUICommandKind?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): StandardUICommand? {
      val fnPtr = _2104316859_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StandardUICommand>()
      val hr = fn.invokeHR(arrayOf(__2104316859_Ptr, marshalToNative(kind),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StandardUICommand>(result.getValue())
      return resultValue
    }
  }

  public class IStandardUICommandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2104316859_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardUICommandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5800f09937465bcfb1ceaf3d6bf8e83f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardUICommandFactory(ptr: Pointer?): WithDefault =
        IStandardUICommandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardUICommandFactory {
      val address = segment.toRawLongValue()
      return makeIStandardUICommandFactory(Pointer(address))
    }

    public override fun toNative(obj: IStandardUICommandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2104316859_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardUICommandFactory):
        Array<IStandardUICommandFactory?> = (elements as
        Array<IStandardUICommandFactory?>).castToImpl<IStandardUICommandFactory,IStandardUICommandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardUICommandFactory?> =
        arrayOfNulls<IStandardUICommandFactory_Impl>(size) as Array<IStandardUICommandFactory?>
  }
}
