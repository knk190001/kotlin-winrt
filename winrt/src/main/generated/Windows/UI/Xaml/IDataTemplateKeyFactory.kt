package Windows.UI.Xaml

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

@ABIMarker(IDataTemplateKeyFactory.ABI::class)
@Signature("{e96b2959-d982-4152-91cb-de0e4dfd7693}")
@Guid("e96b2959d982415291cbde0e4dfd7693")
@WinRTInterface("e96b2959d982415291cbde0e4dfd7693")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateKeyFactory.ByReference::class)
public interface IDataTemplateKeyFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): DataTemplateKey?

  @InterfaceMethod(1)
  public fun CreateInstanceWithType(
    dataType: IUnknown?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): DataTemplateKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateKeyFactory> {
    public override fun getValue() = ABI.makeIDataTemplateKeyFactory(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateKeyFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateKeyFactory {
    public val __470869023_Ptr: Pointer?

    public val _470869023_VtblPtr: Pointer?
      get() = __470869023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DataTemplateKey? {
      val fnPtr = _470869023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateKey>()
      val hr = fn.invokeHR(arrayOf(__470869023_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithType(
      dataType: IUnknown?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): DataTemplateKey? {
      val fnPtr = _470869023_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateKey>()
      val hr = fn.invokeHR(arrayOf(__470869023_Ptr, marshalToNative(dataType),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateKey>(result.getValue())
      return resultValue
    }
  }

  public class IDataTemplateKeyFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __470869023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateKeyFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e96b2959d982415291cbde0e4dfd7693")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateKeyFactory(ptr: Pointer?): WithDefault =
        IDataTemplateKeyFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateKeyFactory {
      val address = segment.toRawLongValue()
      return makeIDataTemplateKeyFactory(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateKeyFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__470869023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateKeyFactory): Array<IDataTemplateKeyFactory?>
        = (elements as
        Array<IDataTemplateKeyFactory?>).castToImpl<IDataTemplateKeyFactory,IDataTemplateKeyFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateKeyFactory?> =
        arrayOfNulls<IDataTemplateKeyFactory_Impl>(size) as Array<IDataTemplateKeyFactory?>
  }
}
