package Windows.System.Diagnostics

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(DiagnosticInvoker.ABI::class)
@Signature("rc(Windows.System.Diagnostics.DiagnosticInvoker;{187b270a-02e3-4f86-84fc-fdd892b5940f})")
@WinRTByReference(brClass = DiagnosticInvoker.ByReference::class)
public class DiagnosticInvoker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDiagnosticInvoker.WithDefault, IDiagnosticInvoker2.WithDefault, IWinRTObject
    {
  private val __953366498_Interface: IDiagnosticInvoker.WithDefault by lazy {
    as_953366498()
  }


  private val __510409584_Interface: IDiagnosticInvoker2.WithDefault by lazy {
    as_510409584()
  }


  public override val __953366498_Ptr: JNAPointer? by lazy {
    __953366498_Interface.__953366498_Ptr
  }


  public override val __510409584_Ptr: JNAPointer? by lazy {
    __510409584_Interface.__510409584_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__953366498_Interface, __510409584_Interface)

  private fun as_953366498(): IDiagnosticInvoker.WithDefault {
    if(pointer == NULL) {
      return(IDiagnosticInvoker.ABI.makeIDiagnosticInvoker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDiagnosticInvoker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDiagnosticInvoker.ABI.makeIDiagnosticInvoker(ref.value))
  }

  private fun as_510409584(): IDiagnosticInvoker2.WithDefault {
    if(pointer == NULL) {
      return(IDiagnosticInvoker2.ABI.makeIDiagnosticInvoker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDiagnosticInvoker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDiagnosticInvoker2.ABI.makeIDiagnosticInvoker2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DiagnosticInvoker> {
    public override fun getValue() = DiagnosticInvoker(pointer.getPointer(0))

    public fun setValue(value: DiagnosticInvoker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DiagnosticInvoker, MemoryAddress> {
    public val IDiagnosticInvokerStatics_Instance: IDiagnosticInvokerStatics by lazy {
      createIDiagnosticInvokerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDiagnosticInvokerStatics(): IDiagnosticInvokerStatics {
      val refiid = Guid.REFIID(IDiagnosticInvokerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.DiagnosticInvoker".toHandle(),refiid,interfacePtr)
      val result = IDiagnosticInvokerStatics.ABI.makeIDiagnosticInvokerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DiagnosticInvoker {
      val address = segment.toRawLongValue()
      return DiagnosticInvoker(Pointer(address))
    }

    public override fun toNative(obj: DiagnosticInvoker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IDiagnosticInvokerStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IDiagnosticInvokerStatics_Instance.GetForUser(user)

    public fun get_IsSupported() = ABI.IDiagnosticInvokerStatics_Instance.get_IsSupported()
  }
}
