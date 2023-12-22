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

@ABIMarker(IsolatedWindowsEnvironmentShareFolderRequestOptions.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentShareFolderRequestOptions;{c405eb7d-7053-4f6a-9b87-746846ed19b2})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentShareFolderRequestOptions.ByReference::class)
public class IsolatedWindowsEnvironmentShareFolderRequestOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentShareFolderRequestOptions.WithDefault, IWinRTObject
    {
  private val __656968811_Interface:
      IIsolatedWindowsEnvironmentShareFolderRequestOptions.WithDefault by lazy {
    as_656968811()
  }


  public override val __656968811_Ptr: JNAPointer? by lazy {
    __656968811_Interface.__656968811_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__656968811_Interface)

  public constructor() : this(ABI.activate())

  private fun as_656968811(): IIsolatedWindowsEnvironmentShareFolderRequestOptions.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentShareFolderRequestOptions.ABI.makeIIsolatedWindowsEnvironmentShareFolderRequestOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentShareFolderRequestOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentShareFolderRequestOptions.ABI.makeIIsolatedWindowsEnvironmentShareFolderRequestOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentShareFolderRequestOptions> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentShareFolderRequestOptions(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentShareFolderRequestOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentShareFolderRequestOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsEnvironmentShareFolderRequestOptions".toHandle(),
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
        IsolatedWindowsEnvironmentShareFolderRequestOptions {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentShareFolderRequestOptions(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentShareFolderRequestOptions):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
