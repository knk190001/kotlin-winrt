package Windows.Security.Isolation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(IsolatedWindowsEnvironmentShareFileRequestOptions.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentShareFileRequestOptions;{c9190ed8-0fd0-4946-bb88-117a60737b61})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentShareFileRequestOptions.ByReference::class)
public class IsolatedWindowsEnvironmentShareFileRequestOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentShareFileRequestOptions.WithDefault, IWinRTObject {
  private val __1538365987_Interface: IIsolatedWindowsEnvironmentShareFileRequestOptions.WithDefault
      by lazy {
    as_1538365987()
  }


  public override val __1538365987_Ptr: JNAPointer? by lazy {
    __1538365987_Interface.__1538365987_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1538365987_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1538365987(): IIsolatedWindowsEnvironmentShareFileRequestOptions.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentShareFileRequestOptions.ABI.makeIIsolatedWindowsEnvironmentShareFileRequestOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentShareFileRequestOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentShareFileRequestOptions.ABI.makeIIsolatedWindowsEnvironmentShareFileRequestOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentShareFileRequestOptions> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentShareFileRequestOptions(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentShareFileRequestOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentShareFileRequestOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsEnvironmentShareFileRequestOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentShareFileRequestOptions {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentShareFileRequestOptions(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentShareFileRequestOptions):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
